import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class GuiMain {
    public static void main(String[] args) {
        ArrayList<Square> board = new ArrayList<>();
          for (int i = 1; i < 6; i++) {
              for (int j = 1; j < 6; j++) {
                  board.add(new Square(i + j*10, null));
              }
          }
        ArrayList<Square> wSetSquares = new ArrayList<>();
        for (int j = 1; j < 11; j++) {
            wSetSquares.add(new Square(j, null));
        }

        ArrayList<Square> bSetSquares = new ArrayList<>();
        for (int j = 1; j < 11; j++) {
            bSetSquares.add(new Square(j, null));
        }
          ArrayList<Piece> whitePlayingPieces = new ArrayList<>();
          ArrayList<Piece> blackPlayingPieces = new ArrayList<>();

          Player white = new Player(whitePlayingPieces, "white");
          Player black = new Player(blackPlayingPieces, "black");

          white.setSet(wSetSquares);
          black.setSet(bSetSquares);

          black.setToMove(true);

          Player.firstPlayer = black;
          Player.secondPlayer = white;


        // PIECES ICONS
        ImageIcon wk = new ImageIcon("wk.png");
        ImageIcon wg = new ImageIcon("wg.png");
        ImageIcon ws = new ImageIcon("ws.png");
        ImageIcon wb = new ImageIcon("wb.png");
        ImageIcon wr = new ImageIcon("wr.png");
        ImageIcon wp = new ImageIcon("wp.png");
        ImageIcon bk = new ImageIcon("bk.png");
        ImageIcon bg = new ImageIcon("bg.png");
        ImageIcon bs = new ImageIcon("bs.png");
        ImageIcon bb = new ImageIcon("bb.png");
        ImageIcon br = new ImageIcon("br.png");
        ImageIcon bp = new ImageIcon("bp.png");


        // PUTTING THE PIECES ON THE BOARD
          for (Square square : board) {
              switch (square.getNum()) {
                  case 11:
                      Piece K = new Piece("K", square, white);
                      K.getIcon().setIcon(wk);
                      K.setWHITEicon(wk);
                      K.setBLACKicon(bk);
                      white.getPlayingPieces().add(K);
                      square.setPiece(K);
                     break;
                  case 21:
                      Piece G = new Piece("G", square, white);
                      white.getPlayingPieces().add(G);
                      G.getIcon().setIcon(wg);
                      G.setWHITEicon(wg);
                      G.setBLACKicon(bg);
                      square.setPiece(G);
                      break;
                  case 31:
                      Piece S = new Piece("S", square, white);
                      white.getPlayingPieces().add(S);
                      S.setWHITEicon(ws);
                      S.setBLACKicon(bs);
                      S.getIcon().setIcon(ws);
                      square.setPiece(S);
                      break;
                  case 41:
                      Piece B = new Piece("B", square, white);
                      white.getPlayingPieces().add(B);
                      B.getIcon().setIcon(wb);
                      B.setWHITEicon(wb);
                      B.setBLACKicon(bb);
                      square.setPiece(B);
                      break;
                  case 51:
                      Piece L = new Piece("L", square, white);
                      white.getPlayingPieces().add(L);
                      L.getIcon().setIcon(wr);
                      L.setWHITEicon(wr);
                      L.setBLACKicon(br);
                      square.setPiece(L);
                      break;
                  case 12:
                      Piece P = new Piece("P", square, white);
                      white.getPlayingPieces().add(P);
                      P.getIcon().setIcon(wp);
                      P.setWHITEicon(wp);
                      P.setBLACKicon(bp);
                      square.setPiece(P);
                      break;
                  case 54:
                      Piece p = new Piece("p", square, black);
                      black.getPlayingPieces().add(p);
                      p.getIcon().setIcon(bp);
                      p.setWHITEicon(wp);
                      p.setBLACKicon(bp);
                      square.setPiece(p);
                      break;
                  case 15:
                      Piece l = new Piece("l", square, black);
                      black.getPlayingPieces().add(l);
                      l.getIcon().setIcon(br);
                      l.setWHITEicon(wr);
                      l.setBLACKicon(br);
                      square.setPiece(l);
                      break;
                  case 25:
                      Piece b = new Piece("b", square, black);
                      black.getPlayingPieces().add(b);
                      b.getIcon().setIcon(bb);
                      b.setWHITEicon(wb);
                      b.setBLACKicon(bb);
                      square.setPiece(b);
                      break;
                  case 35:
                      Piece s = new Piece("s", square, black);
                      black.getPlayingPieces().add(s);
                      s.getIcon().setIcon(bs);
                      s.setWHITEicon(ws);
                      s.setBLACKicon(bs);
                      square.setPiece(s);
                      break;
                  case 45:
                      Piece g = new Piece("g", square, black);
                      black.getPlayingPieces().add(g);
                      g.getIcon().setIcon(bg);
                      g.setWHITEicon(wg);
                      g.setBLACKicon(bg);
                      square.setPiece(g);
                      break;
                  case 55:
                      Piece k = new Piece("k", square, black);
                      black.getPlayingPieces().add(k);
                      k.getIcon().setIcon(bk);
                      k.setWHITEicon(wk);
                      k.setBLACKicon(bk);
                      square.setPiece(k);
                      break;
              }
          }

        JPanel main = new JPanel();
        main.setBounds(0, 0, 1300, 812);

        ImageIcon background = new ImageIcon("background.png");


        // CREATING EACH SQUARE'S SELECT LABEL
        // FIRST ROW
        ImageIcon yellowFrame = new ImageIcon("transparentYellow.png");
        JLabel selectFrame11 = new JLabel();
        selectFrame11.setIcon(yellowFrame);
        selectFrame11.setBounds(390, 514, 104, 104);

        JLabel selectFrame21 = new JLabel();
        selectFrame21.setIcon(yellowFrame);
        selectFrame21.setBounds(494, 514, 104, 104);

        JLabel selectFrame31 = new JLabel();
        selectFrame31.setIcon(yellowFrame);
        selectFrame31.setBounds(598, 514, 104, 104);

        JLabel selectFrame41 = new JLabel();
        selectFrame41.setIcon(yellowFrame);
        selectFrame41.setBounds(702, 514, 104, 104);

        JLabel selectFrame51 = new JLabel();
        selectFrame51.setIcon(yellowFrame);
        selectFrame51.setBounds(806, 514, 104, 104);


        // SECOND ROW
        JLabel selectFrame12 = new JLabel();
        selectFrame12.setIcon(yellowFrame);
        selectFrame12.setBounds(390, 410, 104, 104);

        JLabel selectFrame22 = new JLabel();
        selectFrame22.setIcon(yellowFrame);
        selectFrame22.setBounds(494, 410, 104, 104);

        JLabel selectFrame32 = new JLabel();
        selectFrame32.setIcon(yellowFrame);
        selectFrame32.setBounds(598, 410, 104, 104);

        JLabel selectFrame42 = new JLabel();
        selectFrame42.setIcon(yellowFrame);
        selectFrame42.setBounds(702, 410, 104, 104);

        JLabel selectFrame52 = new JLabel();
        selectFrame52.setIcon(yellowFrame);
        selectFrame52.setBounds(806, 410, 104, 104);


        // THIRD ROW
        JLabel selectFrame13 = new JLabel();
        selectFrame13.setIcon(yellowFrame);
        selectFrame13.setBounds(390, 306, 104, 104);

        JLabel selectFrame23 = new JLabel();
        selectFrame23.setIcon(yellowFrame);
        selectFrame23.setBounds(494, 306, 104, 104);

        JLabel selectFrame33 = new JLabel();
        selectFrame33.setIcon(yellowFrame);
        selectFrame33.setBounds(598, 306, 104, 104);

        JLabel selectFrame43 = new JLabel();
        selectFrame43.setIcon(yellowFrame);
        selectFrame43.setBounds(702, 306, 104, 104);

        JLabel selectFrame53 = new JLabel();
        selectFrame53.setIcon(yellowFrame);
        selectFrame53.setBounds(806, 306, 104, 104);


        // FOURTH ROW
        JLabel selectFrame14 = new JLabel();
        selectFrame14.setIcon(yellowFrame);
        selectFrame14.setBounds(390, 202, 104, 104);

        JLabel selectFrame24 = new JLabel();
        selectFrame24.setIcon(yellowFrame);
        selectFrame24.setBounds(494, 202, 104, 104);

        JLabel selectFrame34 = new JLabel();
        selectFrame34.setIcon(yellowFrame);
        selectFrame34.setBounds(598, 202, 104, 104);

        JLabel selectFrame44 = new JLabel();
        selectFrame44.setIcon(yellowFrame);
        selectFrame44.setBounds(702, 202, 104, 104);

        JLabel selectFrame54 = new JLabel();
        selectFrame54.setIcon(yellowFrame);
        selectFrame54.setBounds(806, 202, 104, 104);


        // FIFTH ROW
        JLabel selectFrame15 = new JLabel();
        selectFrame15.setIcon(yellowFrame);
        selectFrame15.setBounds(390, 98, 104, 104);

        JLabel selectFrame25 = new JLabel();
        selectFrame25.setIcon(yellowFrame);
        selectFrame25.setBounds(494, 98, 104, 104);

        JLabel selectFrame35 = new JLabel();
        selectFrame35.setIcon(yellowFrame);
        selectFrame35.setBounds(598, 98, 104, 104);

        JLabel selectFrame45 = new JLabel();
        selectFrame45.setIcon(yellowFrame);
        selectFrame45.setBounds(702, 98, 104, 104);

        JLabel selectFrame55 = new JLabel();
        selectFrame55.setIcon(yellowFrame);
        selectFrame55.setBounds(806, 98, 104, 104);



        ImageIcon setW = new ImageIcon("set.png");
        JLabel whiteSet = new JLabel();
        whiteSet.setIcon(setW);
        whiteSet.setBounds(170, 98, 208, 520);

        JLabel blackSet = new JLabel();
        blackSet.setIcon(setW);
        blackSet.setBounds(922 , 98, 208, 520);


        ImageIcon circle = new ImageIcon("circle.png");


        // FIRST ROW --> Allowed squares
        JLabel allowed11 = new JLabel();
        allowed11.setIcon(circle);
        allowed11.setBounds(428, 514, 104, 104);

        JLabel allowed21 = new JLabel();
        allowed21.setIcon(circle);
        allowed21.setBounds(532, 514, 104, 104);

        JLabel allowed31 = new JLabel();
        allowed31.setIcon(circle);
        allowed31.setBounds(636, 514, 104, 104);

        JLabel allowed41 = new JLabel();
        allowed41.setIcon(circle);
        allowed41.setBounds(740, 514, 104, 104);

        JLabel allowed51 = new JLabel();
        allowed51.setIcon(circle);
        allowed51.setBounds(844, 514, 104, 104);


        // SECOND ROW --> Allowed squares
        JLabel allowed12 = new JLabel();
        allowed12.setIcon(circle);
        allowed12.setBounds(428, 410, 104, 104);

        JLabel allowed22 = new JLabel();
        allowed22.setIcon(circle);
        allowed22.setBounds(532, 410, 104, 104);

        JLabel allowed32 = new JLabel();
        allowed32.setIcon(circle);
        allowed32.setBounds(636, 410, 104, 104);

        JLabel allowed42 = new JLabel();
        allowed42.setIcon(circle);
        allowed42.setBounds(740, 410, 104, 104);

        JLabel allowed52 = new JLabel();
        allowed52.setIcon(circle);
        allowed52.setBounds(844, 410, 104, 104);


        // THIRD ROW --> Allowed squares
        JLabel allowed13 = new JLabel();
        allowed13.setIcon(circle);
        allowed13.setBounds(428, 306, 104, 104);

        JLabel allowed23 = new JLabel();
        allowed23.setIcon(circle);
        allowed23.setBounds(532, 306, 104, 104);

        JLabel allowed33 = new JLabel();
        allowed33.setIcon(circle);
        allowed33.setBounds(636, 306, 104, 104);

        JLabel allowed43 = new JLabel();
        allowed43.setIcon(circle);
        allowed43.setBounds(740, 306, 104, 104);

        JLabel allowed53 = new JLabel();
        allowed53.setIcon(circle);
        allowed53.setBounds(844, 306, 104, 104);


        // FOURTH ROW --> Allowed squares
        JLabel allowed14 = new JLabel();
        allowed14.setIcon(circle);
        allowed14.setBounds(428, 202, 104, 104);

        JLabel allowed24 = new JLabel();
        allowed24.setIcon(circle);
        allowed24.setBounds(532, 202, 104, 104);

        JLabel allowed34 = new JLabel();
        allowed34.setIcon(circle);
        allowed34.setBounds(636, 202, 104, 104);

        JLabel allowed44 = new JLabel();
        allowed44.setIcon(circle);
        allowed44.setBounds(740, 202, 104, 104);

        JLabel allowed54 = new JLabel();
        allowed54.setIcon(circle);
        allowed54.setBounds(844, 202, 104, 104);


        // FIFTH ROW --> Allowed squares
        JLabel allowed15 = new JLabel();
        allowed15.setIcon(circle);
        allowed15.setBounds(428, 98, 104, 104);

        JLabel allowed25 = new JLabel();
        allowed25.setIcon(circle);
        allowed25.setBounds(532, 98, 104, 104);

        JLabel allowed35 = new JLabel();
        allowed35.setIcon(circle);
        allowed35.setBounds(636, 98, 104, 104);

        JLabel allowed45 = new JLabel();
        allowed45.setIcon(circle);
        allowed45.setBounds(740, 98, 104, 104);

        JLabel allowed55 = new JLabel();
        allowed55.setIcon(circle);
        allowed55.setBounds(844, 98, 104, 104);



        // FIRST ROW --> icons
        JLabel icon11 = new JLabel();
        icon11.setIcon(null);
        icon11.setBounds(428 - 38, 514, 104, 104);

        JLabel icon21 = new JLabel();
        icon21.setIcon(null);
        icon21.setBounds(532 - 38, 514, 104, 104);

        JLabel icon31 = new JLabel();
        icon31.setIcon(null);
        icon31.setBounds(636 - 38, 514, 104, 104);

        JLabel icon41 = new JLabel();
        icon41.setIcon(null);
        icon41.setBounds(740 - 38, 514, 104, 104);

        JLabel icon51 = new JLabel();
        icon51.setIcon(null);
        icon51.setBounds(844 - 38, 514, 104, 104);


        // SECOND ROW --> icons
        JLabel icon12 = new JLabel();
        icon12.setIcon(null);
        icon12.setBounds(428 - 38, 407, 104, 104);

        JLabel icon22 = new JLabel();
        icon22.setIcon(null);
        icon22.setBounds(532 - 38, 410, 104, 104);

        JLabel icon32 = new JLabel();
        icon32.setIcon(null);
        icon32.setBounds(636 - 38, 410, 104, 104);

        JLabel icon42 = new JLabel();
        icon42.setIcon(null);
        icon42.setBounds(740 - 38, 410, 104, 104);

        JLabel icon52 = new JLabel();
        icon52.setIcon(null);
        icon52.setBounds(844 - 38, 410, 104, 104);


        // THIRD ROW --> icons
        JLabel icon13 = new JLabel();
        icon13.setIcon(null);
        icon13.setBounds(428 - 38, 306, 104, 104);

        JLabel icon23 = new JLabel();
        icon23.setIcon(null);
        icon23.setBounds(532 - 38, 306, 104, 104);

        JLabel icon33 = new JLabel();
        icon33.setIcon(null);
        icon33.setBounds(636 - 38, 306, 104, 104);

        JLabel icon43 = new JLabel();
        icon43.setIcon(null);
        icon43.setBounds(740 - 38, 306, 104, 104);

        JLabel icon53 = new JLabel();
        icon53.setIcon(null);
        icon53.setBounds(844 - 38, 306, 104, 104);


        // FOURTH ROW --> icons
        JLabel icon14 = new JLabel();
        icon14.setIcon(null);
        icon14.setBounds(428 - 38, 202, 104, 104);

        JLabel icon24 = new JLabel();
        icon24.setIcon(null);
        icon24.setBounds(532 - 38, 202, 104, 104);

        JLabel icon34 = new JLabel();
        icon34.setIcon(null);
        icon34.setBounds(636 - 38, 202, 104, 104);

        JLabel icon44 = new JLabel();
        icon44.setIcon(null);
        icon44.setBounds(740 - 38, 202, 104, 104);

        JLabel icon54 = new JLabel();
        icon54.setIcon(null);
        icon54.setBounds(844 - 38, 199, 104, 104);


        // FIFTH ROW --> icons
        JLabel icon15 = new JLabel();
        icon15.setIcon(null);
        icon15.setBounds(428 - 38, 98, 104, 104);

        JLabel icon25 = new JLabel();
        icon25.setIcon(null);
        icon25.setBounds(532 - 38, 98, 104, 104);

        JLabel icon35 = new JLabel();
        icon35.setIcon(null);
        icon35.setBounds(636 - 38, 98, 104, 104);

        JLabel icon45 = new JLabel();
        icon45.setIcon(null);
        icon45.setBounds(740 - 38, 98, 104, 104);

        JLabel icon55 = new JLabel();
        icon55.setIcon(null);
        icon55.setBounds(844 - 38, 98, 104, 104);



        // SETS LABELS
        ImageIcon pinkFrame = new ImageIcon("transparentPink.png");
        JLabel selectFrameW1 = new JLabel();
        selectFrameW1.setIcon(pinkFrame);
        selectFrameW1.setBounds(274, 514, 104, 104);

        JLabel selectFrameW2 = new JLabel();
        selectFrameW2.setIcon(pinkFrame);
        selectFrameW2.setBounds(274, 410, 104, 104);

        JLabel selectFrameW3 = new JLabel();
        selectFrameW3.setIcon(pinkFrame);
        selectFrameW3.setBounds(274, 306, 104, 104);

        JLabel selectFrameW4 = new JLabel();
        selectFrameW4.setIcon(pinkFrame);
        selectFrameW4.setBounds(274, 202, 104, 104);

        JLabel selectFrameW5 = new JLabel();
        selectFrameW5.setIcon(pinkFrame);
        selectFrameW5.setBounds(274, 98, 104, 104);

        JLabel selectFrameW6 = new JLabel();
        selectFrameW6.setIcon(pinkFrame);
        selectFrameW6.setBounds(170, 514, 104, 104);

        JLabel selectFrameW7 = new JLabel();
        selectFrameW7.setIcon(pinkFrame);
        selectFrameW7.setBounds(170, 410, 104, 104);

        JLabel selectFrameW8 = new JLabel();
        selectFrameW8.setIcon(pinkFrame);
        selectFrameW8.setBounds(170, 306, 104, 104);

        JLabel selectFrameW9 = new JLabel();
        selectFrameW9.setIcon(pinkFrame);
        selectFrameW9.setBounds(170, 202, 104, 104);

        JLabel selectFrameW10 = new JLabel();
        selectFrameW10.setIcon(pinkFrame);
        selectFrameW10.setBounds(170, 98, 104, 104);


        JLabel selectFrameB1 = new JLabel();
        selectFrameB1.setIcon(pinkFrame);
        selectFrameB1.setBounds(922, 514, 104, 104);

        JLabel selectFrameB2 = new JLabel();
        selectFrameB2.setIcon(pinkFrame);
        selectFrameB2.setBounds(922, 410, 104, 104);

        JLabel selectFrameB3 = new JLabel();
        selectFrameB3.setIcon(pinkFrame);
        selectFrameB3.setBounds(922, 306, 104, 104);

        JLabel selectFrameB4 = new JLabel();
        selectFrameB4.setIcon(pinkFrame);
        selectFrameB4.setBounds(922, 202, 104, 104);

        JLabel selectFrameB5 = new JLabel();
        selectFrameB5.setIcon(pinkFrame);
        selectFrameB5.setBounds(922, 98, 104, 104);

        JLabel selectFrameB6 = new JLabel();
        selectFrameB6.setIcon(pinkFrame);
        selectFrameB6.setBounds(1026, 514, 104, 104);

        JLabel selectFrameB7 = new JLabel();
        selectFrameB7.setIcon(pinkFrame);
        selectFrameB7.setBounds(1026, 410, 104, 104);

        JLabel selectFrameB8 = new JLabel();
        selectFrameB8.setIcon(pinkFrame);
        selectFrameB8.setBounds(1026, 306, 104, 104);

        JLabel selectFrameB9 = new JLabel();
        selectFrameB9.setIcon(pinkFrame);
        selectFrameB9.setBounds(1026, 202, 104, 104);

        JLabel selectFrameB10 = new JLabel();
        selectFrameB10.setIcon(pinkFrame);
        selectFrameB10.setBounds(1026, 98, 104, 104);



        JLabel iconW1 = new JLabel();
        iconW1.setIcon(null);
        iconW1.setBounds(274, 514, 104, 104);

        JLabel iconW2 = new JLabel();
        iconW2.setIcon(null);
        iconW2.setBounds(274, 410, 104, 104);

        JLabel iconW3 = new JLabel();
        iconW3.setIcon(null);
        iconW3.setBounds(274, 306, 104, 104);

        JLabel iconW4 = new JLabel();
        iconW4.setIcon(null);
        iconW4.setBounds(274, 202, 104, 104);

        JLabel iconW5 = new JLabel();
        iconW5.setIcon(null);
        iconW5.setBounds(274, 98, 104, 104);

        JLabel iconW6 = new JLabel();
        iconW6.setIcon(null);
        iconW6.setBounds(170, 514, 104, 104);

        JLabel iconW7 = new JLabel();
        iconW7.setIcon(null);
        iconW7.setBounds(170, 410, 104, 104);

        JLabel iconW8 = new JLabel();
        iconW8.setIcon(null);
        iconW8.setBounds(170, 306, 104, 104);

        JLabel iconW9 = new JLabel();
        iconW9.setIcon(null);
        iconW9.setBounds(170, 202, 104, 104);

        JLabel iconW10 = new JLabel();
        iconW10.setIcon(null);
        iconW10.setBounds(170, 98, 104, 104);


        JLabel iconB1 = new JLabel();
        iconB1.setIcon(null);
        iconB1.setBounds(922, 514, 104, 104);

        JLabel iconB2 = new JLabel();
        iconB2.setIcon(null);
        iconB2.setBounds(922, 410, 104, 104);

        JLabel iconB3 = new JLabel();
        iconB3.setIcon(null);
        iconB3.setBounds(922, 306, 104, 104);

        JLabel iconB4 = new JLabel();
        iconB4.setIcon(null);
        iconB4.setBounds(922, 202, 104, 104);

        JLabel iconB5 = new JLabel();
        iconB5.setIcon(null);
        iconB5.setBounds(922, 98, 104, 104);

        JLabel iconB6 = new JLabel();
        iconB6.setIcon(null);
        iconB6.setBounds(1026, 514, 104, 104);

        JLabel iconB7 = new JLabel();
        iconB7.setIcon(null);
        iconB7.setBounds(1026, 410, 104, 104);

        JLabel iconB8 = new JLabel();
        iconB8.setIcon(null);
        iconB8.setBounds(1026, 306, 104, 104);

        JLabel iconB9 = new JLabel();
        iconB9.setIcon(null);
        iconB9.setBounds(1026, 202, 104, 104);

        JLabel iconB10 = new JLabel();
        iconB10.setIcon(null);
        iconB10.setBounds(1026, 98, 104, 104);


        JLabel bckgrnd = new JLabel();
        bckgrnd.setIcon(background);


        bckgrnd.add(allowed11);
        bckgrnd.add(allowed21);
        bckgrnd.add(allowed31);
        bckgrnd.add(allowed41);
        bckgrnd.add(allowed51);
        bckgrnd.add(allowed12);
        bckgrnd.add(allowed22);
        bckgrnd.add(allowed32);
        bckgrnd.add(allowed42);
        bckgrnd.add(allowed52);
        bckgrnd.add(allowed13);
        bckgrnd.add(allowed23);
        bckgrnd.add(allowed33);
        bckgrnd.add(allowed43);
        bckgrnd.add(allowed53);
        bckgrnd.add(allowed14);
        bckgrnd.add(allowed24);
        bckgrnd.add(allowed34);
        bckgrnd.add(allowed44);
        bckgrnd.add(allowed54);
        bckgrnd.add(allowed15);
        bckgrnd.add(allowed25);
        bckgrnd.add(allowed35);
        bckgrnd.add(allowed45);
        bckgrnd.add(allowed55);


        allowed11.setVisible(false);
        allowed21.setVisible(false);
        allowed31.setVisible(false);
        allowed41.setVisible(false);
        allowed51.setVisible(false);
        allowed12.setVisible(false);
        allowed22.setVisible(false);
        allowed32.setVisible(false);
        allowed42.setVisible(false);
        allowed52.setVisible(false);
        allowed13.setVisible(false);
        allowed23.setVisible(false);
        allowed33.setVisible(false);
        allowed43.setVisible(false);
        allowed53.setVisible(false);
        allowed14.setVisible(false);
        allowed24.setVisible(false);
        allowed34.setVisible(false);
        allowed44.setVisible(false);
        allowed54.setVisible(false);
        allowed15.setVisible(false);
        allowed25.setVisible(false);
        allowed35.setVisible(false);
        allowed45.setVisible(false);
        allowed55.setVisible(false);


        for (Square square : wSetSquares) {
            switch (square.getNum()) {
                case 1:
                    square.setYellowSquare(selectFrameW1);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(iconW1);
                    bckgrnd.add(iconW1);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 2:
                    square.setYellowSquare(selectFrameW2);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(iconW2);
                    bckgrnd.add(iconW2);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 3:
                    square.setYellowSquare(selectFrameW3);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(iconW3);
                    bckgrnd.add(iconW3);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 4:
                    square.setYellowSquare(selectFrameW4);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(iconW4);
                    bckgrnd.add(iconW4);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 5:
                    square.setYellowSquare(selectFrameW5);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(iconW5);
                    bckgrnd.add(iconW5);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 6:
                    square.setYellowSquare(selectFrameW6);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(iconW6);
                    bckgrnd.add(iconW6);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 7:
                    square.setYellowSquare(selectFrameW7);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(iconW7);
                    bckgrnd.add(iconW7);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 8:
                    square.setYellowSquare(selectFrameW8);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(iconW8);
                    bckgrnd.add(iconW8);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 9:
                    square.setYellowSquare(selectFrameW9);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(iconW9);
                    bckgrnd.add(iconW9);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 10:
                    square.setYellowSquare(selectFrameW10);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(iconW10);
                    bckgrnd.add(iconW10);
                    bckgrnd.add(square.getTHELabel());
                    break;
            }
        }

        for (Square square : bSetSquares) {
            switch (square.getNum()) {
                case 1:
                    square.setYellowSquare(selectFrameB1);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(iconB1);
                    bckgrnd.add(iconB1);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 2:
                    square.setYellowSquare(selectFrameB2);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(iconB2);
                    bckgrnd.add(iconB2);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 3:
                    square.setYellowSquare(selectFrameB3);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(iconB3);
                    bckgrnd.add(iconB3);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 4:
                    square.setYellowSquare(selectFrameB4);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(iconB4);
                    bckgrnd.add(iconB4);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 5:
                    square.setYellowSquare(selectFrameB5);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(iconB5);
                    bckgrnd.add(iconB5);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 6:
                    square.setYellowSquare(selectFrameB6);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(iconB6);
                    bckgrnd.add(iconB6);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 7:
                    square.setYellowSquare(selectFrameB7);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(iconB7);
                    bckgrnd.add(iconB7);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 8:
                    square.setYellowSquare(selectFrameB8);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(iconB8);
                    bckgrnd.add(iconB8);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 9:
                    square.setYellowSquare(selectFrameB9);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(iconB9);
                    bckgrnd.add(iconB9);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 10:
                    square.setYellowSquare(selectFrameB10);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(iconB10);
                    bckgrnd.add(iconB10);
                    bckgrnd.add(square.getTHELabel());
                    break;
            }
        }

        bckgrnd.add(selectFrameW1);
        bckgrnd.add(selectFrameW2);
        bckgrnd.add(selectFrameW3);
        bckgrnd.add(selectFrameW4);
        bckgrnd.add(selectFrameW5);
        bckgrnd.add(selectFrameW6);
        bckgrnd.add(selectFrameW7);
        bckgrnd.add(selectFrameW8);
        bckgrnd.add(selectFrameW9);
        bckgrnd.add(selectFrameW10);

        bckgrnd.add(selectFrameB1);
        bckgrnd.add(selectFrameB2);
        bckgrnd.add(selectFrameB3);
        bckgrnd.add(selectFrameB4);
        bckgrnd.add(selectFrameB5);
        bckgrnd.add(selectFrameB6);
        bckgrnd.add(selectFrameB7);
        bckgrnd.add(selectFrameB8);
        bckgrnd.add(selectFrameB9);
        bckgrnd.add(selectFrameB10);


        selectFrame11.setVisible(false);
        selectFrame21.setVisible(false);
        selectFrame31.setVisible(false);
        selectFrame41.setVisible(false);
        selectFrame51.setVisible(false);
        selectFrame12.setVisible(false);
        selectFrame22.setVisible(false);
        selectFrame32.setVisible(false);
        selectFrame42.setVisible(false);
        selectFrame52.setVisible(false);
        selectFrame13.setVisible(false);
        selectFrame23.setVisible(false);
        selectFrame33.setVisible(false);
        selectFrame43.setVisible(false);
        selectFrame53.setVisible(false);
        selectFrame14.setVisible(false);
        selectFrame24.setVisible(false);
        selectFrame34.setVisible(false);
        selectFrame44.setVisible(false);
        selectFrame54.setVisible(false);
        selectFrame15.setVisible(false);
        selectFrame25.setVisible(false);
        selectFrame35.setVisible(false);
        selectFrame45.setVisible(false);
        selectFrame55.setVisible(false);


        selectFrameW1.setVisible(false);
        selectFrameW2.setVisible(false);
        selectFrameW3.setVisible(false);
        selectFrameW4.setVisible(false);
        selectFrameW5.setVisible(false);
        selectFrameW6.setVisible(false);
        selectFrameW7.setVisible(false);
        selectFrameW8.setVisible(false);
        selectFrameW9.setVisible(false);
        selectFrameW10.setVisible(false);
        selectFrameB1.setVisible(false);
        selectFrameB2.setVisible(false);
        selectFrameB3.setVisible(false);
        selectFrameB4.setVisible(false);
        selectFrameB5.setVisible(false);
        selectFrameB6.setVisible(false);
        selectFrameB7.setVisible(false);
        selectFrameB8.setVisible(false);
        selectFrameB9.setVisible(false);
        selectFrameB10.setVisible(false);


        bckgrnd.add(whiteSet);
        bckgrnd.add(blackSet);


        for (Square square : board) {
            switch (square.getNum()) {
                case 11:
                    square.setYellowSquare(selectFrame11);
                    square.setGrayCircle(allowed11);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(icon11);
                    icon11.setIcon(square.getPiece().getIcon().getIcon());
                    bckgrnd.add(icon11);
                    bckgrnd.add(selectFrame11);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 21:
                    square.setYellowSquare(selectFrame21);
                    square.setGrayCircle(allowed21);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(icon21);
                    icon21.setIcon(square.getPiece().getIcon().getIcon());
                    bckgrnd.add(icon21);
                    bckgrnd.add(selectFrame21);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 31:
                    square.setYellowSquare(selectFrame31);
                    square.setGrayCircle(allowed31);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(icon31);
                    icon31.setIcon(square.getPiece().getIcon().getIcon());
                    bckgrnd.add(icon31);
                    bckgrnd.add(selectFrame31);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 41:
                    square.setYellowSquare(selectFrame41);
                    square.setGrayCircle(allowed41);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(icon41);
                    icon41.setIcon(square.getPiece().getIcon().getIcon());
                    bckgrnd.add(icon41);
                    bckgrnd.add(selectFrame41);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 51:
                    square.setYellowSquare(selectFrame51);
                    square.setGrayCircle(allowed51);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(icon51);
                    icon51.setIcon(square.getPiece().getIcon().getIcon());
                    bckgrnd.add(icon51);
                    bckgrnd.add(selectFrame51);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 12:
                    square.setYellowSquare(selectFrame12);
                    square.setGrayCircle(allowed12);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(icon12);
                    icon12.setIcon(square.getPiece().getIcon().getIcon());
                    bckgrnd.add(icon12);
                    bckgrnd.add(selectFrame12);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 22:
                    square.setYellowSquare(selectFrame22);
                    square.setGrayCircle(allowed22);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(icon22);
                    icon22.setIcon(square.getPiece() == null ? null : square.getPiece().getIcon().getIcon());
                    bckgrnd.add(icon22);
                    bckgrnd.add(selectFrame22);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 32:
                    square.setYellowSquare(selectFrame32);
                    square.setGrayCircle(allowed32);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(icon32);
                    icon32.setIcon(square.getPiece() == null ? null : square.getPiece().getIcon().getIcon());
                    bckgrnd.add(icon32);
                    bckgrnd.add(selectFrame32);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 42:
                    square.setYellowSquare(selectFrame42);
                    square.setGrayCircle(allowed42);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(icon42);
                    icon42.setIcon(square.getPiece() == null ? null : square.getPiece().getIcon().getIcon());
                    bckgrnd.add(icon42);
                    bckgrnd.add(selectFrame42);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 52:
                    square.setYellowSquare(selectFrame52);
                    square.setGrayCircle(allowed52);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(icon52);
                    icon52.setIcon(square.getPiece() == null ? null : square.getPiece().getIcon().getIcon());
                    bckgrnd.add(icon52);
                    bckgrnd.add(selectFrame52);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 13:
                    square.setYellowSquare(selectFrame13);
                    square.setGrayCircle(allowed13);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(icon13);
                    icon13.setIcon(square.getPiece() == null ? null : square.getPiece().getIcon().getIcon());
                    bckgrnd.add(icon13);
                    bckgrnd.add(selectFrame13);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 23:
                    square.setYellowSquare(selectFrame23);
                    square.setGrayCircle(allowed23);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(icon23);
                    icon23.setIcon(square.getPiece() == null ? null : square.getPiece().getIcon().getIcon());
                    bckgrnd.add(icon23);
                    bckgrnd.add(selectFrame23);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 33:
                    square.setYellowSquare(selectFrame33);
                    square.setGrayCircle(allowed33);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(icon33);
                    icon33.setIcon(square.getPiece() == null ? null : square.getPiece().getIcon().getIcon());
                    bckgrnd.add(icon33);
                    bckgrnd.add(selectFrame33);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 43:
                    square.setYellowSquare(selectFrame43);
                    square.setGrayCircle(allowed43);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(icon43);
                    icon43.setIcon(square.getPiece() == null ? null : square.getPiece().getIcon().getIcon());
                    bckgrnd.add(icon43);
                    bckgrnd.add(selectFrame43);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 53:
                    square.setYellowSquare(selectFrame53);
                    square.setGrayCircle(allowed53);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(icon53);
                    icon53.setIcon(square.getPiece() == null ? null : square.getPiece().getIcon().getIcon());
                    bckgrnd.add(icon53);
                    bckgrnd.add(selectFrame53);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 14:
                    square.setYellowSquare(selectFrame14);
                    square.setGrayCircle(allowed14);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(icon14);
                    icon14.setIcon(square.getPiece() == null ? null : square.getPiece().getIcon().getIcon());
                    bckgrnd.add(icon14);
                    bckgrnd.add(selectFrame14);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 24:
                    square.setYellowSquare(selectFrame24);
                    square.setGrayCircle(allowed24);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(icon24);
                    icon24.setIcon(square.getPiece() == null ? null : square.getPiece().getIcon().getIcon());
                    bckgrnd.add(icon24);
                    bckgrnd.add(selectFrame24);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 34:
                    square.setYellowSquare(selectFrame34);
                    square.setGrayCircle(allowed34);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(icon34);
                    icon34.setIcon(square.getPiece() == null ? null : square.getPiece().getIcon().getIcon());
                    bckgrnd.add(icon34);
                    bckgrnd.add(selectFrame34);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 44:
                    square.setYellowSquare(selectFrame44);
                    square.setGrayCircle(allowed44);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(icon44);
                    icon44.setIcon(square.getPiece() == null ? null : square.getPiece().getIcon().getIcon());
                    bckgrnd.add(icon44);
                    bckgrnd.add(selectFrame44);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 54:
                    square.setYellowSquare(selectFrame54);
                    square.setGrayCircle(allowed54);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(icon54);
                    icon54.setIcon(square.getPiece() == null ? null : square.getPiece().getIcon().getIcon());
                    bckgrnd.add(icon54);
                    bckgrnd.add(selectFrame54);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 15:
                    square.setYellowSquare(selectFrame15);
                    square.setGrayCircle(allowed15);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(icon15);
                    icon15.setIcon(square.getPiece() == null ? null : square.getPiece().getIcon().getIcon());
                    bckgrnd.add(icon15);
                    bckgrnd.add(selectFrame15);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 25:
                    square.setYellowSquare(selectFrame25);
                    square.setGrayCircle(allowed25);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(icon25);
                    icon25.setIcon(square.getPiece() == null ? null : square.getPiece().getIcon().getIcon());
                    bckgrnd.add(icon25);
                    bckgrnd.add(selectFrame25);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 35:
                    square.setYellowSquare(selectFrame35);
                    square.setGrayCircle(allowed35);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(icon35);
                    icon35.setIcon(square.getPiece() == null ? null : square.getPiece().getIcon().getIcon());
                    bckgrnd.add(icon35);
                    bckgrnd.add(selectFrame35);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 45:
                    square.setYellowSquare(selectFrame45);
                    square.setGrayCircle(allowed45);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(icon45);
                    icon45.setIcon(square.getPiece() == null ? null : square.getPiece().getIcon().getIcon());
                    bckgrnd.add(icon45);
                    bckgrnd.add(selectFrame45);
                    bckgrnd.add(square.getTHELabel());
                    break;
                case 55:
                    square.setYellowSquare(selectFrame55);
                    square.setGrayCircle(allowed55);
                    square.setTHELabel(new Label(square));
                    square.setPieceIcon(icon55);
                    icon55.setIcon(square.getPiece() == null ? null : square.getPiece().getIcon().getIcon());
                    bckgrnd.add(icon55);
                    bckgrnd.add(selectFrame55);
                    bckgrnd.add(square.getTHELabel());
                    break;
            }
        }

        ImageIcon blackWins = new ImageIcon("winnerBlack.png");
        ImageIcon whiteWins = new ImageIcon("winnerWhite.png");
        JLabel bWins = new JLabel();
        bWins.setIcon(blackWins);
        bWins.setBounds(480, 550, 400, 200);

        JLabel wWins = new JLabel();
        wWins.setIcon(whiteWins);
        wWins.setBounds(480, 550, 400, 200);

        bckgrnd.add(bWins);
        bckgrnd.add(wWins);

        wWins.setVisible(false);
        bWins.setVisible(false);


        white.setWin(wWins);
        black.setWin(bWins);


        ImageIcon restrt = new ImageIcon("restart3.png");
        JLabel restartButton = new JLabel();
        restartButton.setIcon(restrt);
        restartButton.setBounds(53, 662, 70, 70);

        Square zero = new Square(0, null);
        zero.setYellowSquare(restartButton);
        zero.setTHELabel(new Label(zero));

        bckgrnd.add(zero.getTHELabel());
        bckgrnd.add(restartButton);


        main.add(bckgrnd);


        JFrame frame = new JFrame();
        frame.setSize(1300, 812);
        frame.setTitle("Game of Generals");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.add(main);
        frame.setVisible(true);
    }
}

class Label extends JLabel implements MouseListener {
    Square square;
    static Label lastSelected = null;
    static boolean blackToMove = true;

    Label(Square square) {
        this.square = square;
        this.setBounds(square.getYellowSquare().getBounds());
        this.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
            if (square.getNum() == 0) {
                if (lastSelected != null) {
                    lastSelected.getSquare().getYellowSquare().setVisible(false);
                    for (Integer n : lastSelected.getSquare().getPiece().AllowedSquares(lastSelected.getSquare().getBoard(), lastSelected.getSquare().getPiece(), lastSelected.getSquare().getNum())) {
                        for (Square s : lastSelected.getSquare().getBoard()) {
                            if (s.getNum() == n) {
                                s.getGrayCircle().setVisible(false);
                            }
                        }
                    }
                    lastSelected = null;
                }
                blackToMove = true;
                Player.firstPlayer.setToMove(true);
                Player.secondPlayer.setToMove(false);

                Player.firstPlayer.setNonPlayingPieces(new ArrayList<>());
                Player.firstPlayer.setPlayingPieces(new ArrayList<>());

                Player.secondPlayer.setNonPlayingPieces(new ArrayList<>());
                Player.secondPlayer.setPlayingPieces(new ArrayList<>());

                for (Square square : Player.firstPlayer.getSet()) {
                    square.setPiece(null);
                    square.getPieceIcon().setIcon(null);
                }

                for (Square square : Player.secondPlayer.getSet()) {
                    square.setPiece(null);
                    square.getPieceIcon().setIcon(null);
                }

                Square sK = null;
                Square sG = null;
                Square sS = null;
                Square sB = null;
                Square sR = null;
                Square sP = null;
                Square sk = null;
                Square sg = null;
                Square ss = null;
                Square sb = null;
                Square sr = null;
                Square sp = null;

                for (Square s : square.getBoard()) {
                    s.getPieceIcon().setIcon(null);
                    s.setPiece(null);
                    switch (s.getNum()) {
                        case 11:
                            sK = s;
                            break;
                        case 21:
                            sG = s;
                            break;
                        case 31:
                            sS = s;
                            break;
                        case 41:
                            sB = s;
                            break;
                        case 51:
                            sR = s;
                            break;
                        case 12:
                            sP = s;
                            break;
                        case 55:
                            sk = s;
                            break;
                        case 45:
                            sg = s;
                            break;
                        case 35:
                            ss = s;
                            break;
                        case 25:
                            sb = s;
                            break;
                        case 15:
                            sr = s;
                            break;
                        case 54:
                            sp = s;
                            break;
                    }
                }
                for (Piece p : Piece.allPieces) {
                    switch (p.getName()) {
                        case "K":
                            p.getIcon().setIcon(p.getWHITEicon());
                            p.setSquare(sK);
                            assert sK != null;
                            sK.setPiece(p);
                            sK.getPieceIcon().setIcon(p.getIcon().getIcon());
                            Player.secondPlayer.getPlayingPieces().add(p);
                            p.setPlayer(Player.secondPlayer);
                            p.setPromoted(false);
                            break;
                        case "G":
                            p.getIcon().setIcon(p.getWHITEicon());
                            p.setSquare(sG);
                            assert sG != null;
                            sG.setPiece(p);
                            sG.getPieceIcon().setIcon(p.getIcon().getIcon());
                            Player.secondPlayer.getPlayingPieces().add(p);
                            p.setPlayer(Player.secondPlayer);
                            p.setPromoted(false);
                            break;
                        case "S":
                            p.getIcon().setIcon(p.getWHITEicon());
                            p.setSquare(sS);
                            sS.setPiece(p);
                            sS.getPieceIcon().setIcon(p.getIcon().getIcon());
                            Player.secondPlayer.getPlayingPieces().add(p);
                            p.setPlayer(Player.secondPlayer);
                            p.setPromoted(false);
                            break;
                        case "B":
                            p.getIcon().setIcon(p.getWHITEicon());
                            p.setSquare(sB);
                            assert sB != null;
                            sB.setPiece(p);
                            sB.getPieceIcon().setIcon(p.getIcon().getIcon());
                            Player.secondPlayer.getPlayingPieces().add(p);
                            p.setPlayer(Player.secondPlayer);
                            p.setPromoted(false);
                            break;
                        case "L":
                            p.getIcon().setIcon(p.getWHITEicon());
                            p.setSquare(sR);
                            assert sR != null;
                            sR.setPiece(p);
                            sR.getPieceIcon().setIcon(p.getIcon().getIcon());
                            Player.secondPlayer.getPlayingPieces().add(p);
                            p.setPlayer(Player.secondPlayer);
                            p.setPromoted(false);
                            break;
                        case "P":
                            p.getIcon().setIcon(p.getWHITEicon());
                            p.setSquare(sP);
                            assert sP != null;
                            sP.setPiece(p);
                            sP.getPieceIcon().setIcon(p.getIcon().getIcon());
                            Player.secondPlayer.getPlayingPieces().add(p);
                            p.setPlayer(Player.secondPlayer);
                            p.setPromoted(false);
                            break;
                        case "k":
                            p.getIcon().setIcon(p.getBLACKicon());
                            p.setSquare(sk);
                            assert sk != null;
                            sk.setPiece(p);
                            sk.getPieceIcon().setIcon(p.getIcon().getIcon());
                            Player.firstPlayer.getPlayingPieces().add(p);
                            p.setPlayer(Player.firstPlayer);
                            p.setPromoted(false);
                            break;
                        case "g":
                            p.getIcon().setIcon(p.getBLACKicon());
                            p.setSquare(sg);
                            assert sg != null;
                            sg.setPiece(p);
                            sg.getPieceIcon().setIcon(p.getIcon().getIcon());
                            Player.firstPlayer.getPlayingPieces().add(p);
                            p.setPlayer(Player.firstPlayer);
                            p.setPromoted(false);
                            break;
                        case "s":
                            p.getIcon().setIcon(p.getBLACKicon());
                            p.setSquare(ss);
                            assert ss != null;
                            ss.setPiece(p);
                            ss.getPieceIcon().setIcon(p.getIcon().getIcon());
                            Player.firstPlayer.getPlayingPieces().add(p);
                            p.setPlayer(Player.firstPlayer);
                            p.setPromoted(false);
                            break;
                        case "b":
                            p.getIcon().setIcon(p.getBLACKicon());
                            p.setSquare(sb);
                            sb.setPiece(p);
                            sb.getPieceIcon().setIcon(p.getIcon().getIcon());
                            Player.firstPlayer.getPlayingPieces().add(p);
                            p.setPlayer(Player.firstPlayer);
                            p.setPromoted(false);
                            break;
                        case "l":
                            p.getIcon().setIcon(p.getBLACKicon());
                            p.setSquare(sr);
                            assert sr != null;
                            sr.setPiece(p);
                            sr.getPieceIcon().setIcon(p.getIcon().getIcon());
                            Player.firstPlayer.getPlayingPieces().add(p);
                            p.setPlayer(Player.firstPlayer);
                            p.setPromoted(false);
                            break;
                        case "p":
                            p.getIcon().setIcon(p.getBLACKicon());
                            p.setSquare(sp);
                            assert sp != null;
                            sp.setPiece(p);
                            sp.getPieceIcon().setIcon(p.getIcon().getIcon());
                            Player.firstPlayer.getPlayingPieces().add(p);
                            p.setPlayer(Player.firstPlayer);
                            p.setPromoted(false);
                            break;
                    }
                }
                Player.secondPlayer.getWin().setVisible(false);
                Player.firstPlayer.getWin().setVisible(false);
            }
            else {
                if (lastSelected != null) {
                    if (square.getPiece() == null) {
                        if (lastSelected.getSquare().getPiece().getPlayer().getSet().contains(lastSelected.getSquare()) && !lastSelected.getSquare().getPiece().getPlayer().getSet().contains(square)) {
                            lastSelected.getSquare().getPiece().getPlayer().setToMove(false);
                            for (Player player : Player.players) {
                                if (!player.getName().equals(lastSelected.getSquare().getPiece().getPlayer().getName())) {
                                    player.setToMove(true);
                                }
                            }
                            lastSelected.getSquare().getYellowSquare().setVisible(false);
                            lastSelected.getSquare().getPiece().getPlayer().getPlayingPieces().add(lastSelected.getSquare().getPiece());
                            lastSelected.getSquare().getPiece().getPlayer().getNonPlayingPieces().remove(lastSelected.getSquare().getPiece());
                            square.getPieceIcon().setIcon(lastSelected.getSquare().getPiece().getIcon().getIcon());
                            square.setPiece(lastSelected.getSquare().getPiece());
                            lastSelected.getSquare().getPiece().setSquare(square);
                            lastSelected.getSquare().getPieceIcon().setIcon(null);

                            Piece AHHH;
                            AHHH = lastSelected.getSquare().getPiece();

                            lastSelected.getSquare().setPiece(null);

                            for (Square s : AHHH.getPlayer().getSet()) {
                                s.getPieceIcon().setIcon(null);
                            }
                            for (Piece p : AHHH.getPlayer().getNonPlayingPieces()) {

                                for (Square s : AHHH.getPlayer().getSet()) {
                                    if (s.getPieceIcon().getIcon() == null) {
                                        s.setPiece(p);
                                        p.setSquare(s);
                                        s.getPieceIcon().setIcon(p.getIcon().getIcon());
                                        break;
                                    }
                                }
                            }
                            for (Square s : AHHH.getPlayer().getSet()) {
                                if (s.getPieceIcon().getIcon() == null) {
                                    s.setPiece(null);
                                }
                            }
                            lastSelected = null;
                            blackToMove = !blackToMove;
                        }

                        else if (lastSelected.getSquare().getPiece().AllowedSquares(lastSelected.getSquare().getBoard(), lastSelected.getSquare().getPiece(), lastSelected.getSquare().getNum()).contains(square.getNum())) {
                            lastSelected.getSquare().getYellowSquare().setVisible(false);
                            for (Integer n : lastSelected.getSquare().getPiece().AllowedSquares(lastSelected.getSquare().getBoard(), lastSelected.getSquare().getPiece(), lastSelected.getSquare().getNum())) {
                                for (Square s : lastSelected.getSquare().getBoard()) {
                                    if (s.getNum() == n) {
                                        s.getGrayCircle().setVisible(false);
                                    }
                                }
                            }
                            lastSelected.getSquare().getPiece().getPlayer().setToMove(false);
                            for (Player player : Player.players) {
                                if (!player.getName().equals(lastSelected.getSquare().getPiece().getPlayer().getName())) {
                                    player.setToMove(true);
                                }
                            }
                            lastSelected.getSquare().getPiece().Move(lastSelected.getSquare().getBoard(), lastSelected.getSquare().getNum(), square.getNum());

                            blackToMove = !blackToMove;
                            lastSelected = null;
                        }
                    }
                    else if (lastSelected.getSquare().getPiece().getPlayer().isToMove() == this.getSquare().getPiece().getPlayer().isToMove()) {
                        if (lastSelected.equals(this)) {
                            square.getYellowSquare().setVisible(false);
                            for (Integer n : square.getPiece().AllowedSquares(square.getBoard(), square.getPiece(), square.getNum())) {
                                for (Square s : square.getBoard()) {
                                    if (s.getNum() == n) {
                                        s.getGrayCircle().setVisible(false);
                                    }
                                }
                            }
                            lastSelected = null;
                        }
                        else if (lastSelected.getSquare().getPiece().getPlayer().getSet().contains(lastSelected.getSquare())) {


                            if (square.getPiece().getPlayer().getSet().contains(square)) {
                                lastSelected.getSquare().getYellowSquare().setVisible(false);
                                square.getYellowSquare().setVisible(true);
                                lastSelected = this;
                            }
                            else {
                                lastSelected.getSquare().getYellowSquare().setVisible(false);
                                square.getYellowSquare().setVisible(true);
                                for (Integer n : square.getPiece().AllowedSquares(square.getBoard(), square.getPiece(), square.getNum())) {
                                    for (Square s : square.getBoard()) {
                                        if (s.getNum() == n) {
                                            s.getGrayCircle().setVisible(true);
                                        }
                                    }
                                }
                                lastSelected = this;
                            }
                        }
                        else {
                            lastSelected.getSquare().getYellowSquare().setVisible(false);
                            for (Integer n : lastSelected.getSquare().getPiece().AllowedSquares(lastSelected.getSquare().getBoard(), lastSelected.getSquare().getPiece(), lastSelected.getSquare().getNum())) {
                                for (Square s : lastSelected.getSquare().getBoard()) {
                                    if (s.getNum() == n) {
                                        s.getGrayCircle().setVisible(false);
                                    }
                                }
                            }
                            square.getYellowSquare().setVisible(true);
                            if (!square.getPiece().getPlayer().getSet().contains(square)) {
                                for (Integer n : square.getPiece().AllowedSquares(square.getBoard(), square.getPiece(), square.getNum())) {
                                    for (Square s : square.getBoard()) {
                                        if (s.getNum() == n) {
                                            s.getGrayCircle().setVisible(true);
                                        }
                                    }
                                }
                            }
                            lastSelected = this;
                        }
                    }
                    else {
                        if (!square.getPiece().getPlayer().getSet().contains(square)) {
                            if (lastSelected.getSquare().getPiece().AllowedSquares(lastSelected.getSquare().getBoard(), lastSelected.getSquare().getPiece(), lastSelected.getSquare().getNum()).contains(square.getNum())) {
                                lastSelected.getSquare().getYellowSquare().setVisible(false);
                                for (Integer n : lastSelected.getSquare().getPiece().AllowedSquares(lastSelected.getSquare().getBoard(), lastSelected.getSquare().getPiece(), lastSelected.getSquare().getNum())) {
                                    for (Square s : lastSelected.getSquare().getBoard()) {
                                        if (s.getNum() == n) {
                                            s.getGrayCircle().setVisible(false);
                                        }
                                    }
                                }
                                lastSelected.getSquare().getPiece().Move(lastSelected.getSquare().getBoard(), lastSelected.getSquare().getNum(), square.getNum());
                                blackToMove = !blackToMove;
                                lastSelected = null;
                            }
                        }
                    }
                }
                else {
                    if (square.getPiece() != null) {
                        if (square.getPiece().getPlayer().isToMove()) {
                            lastSelected = this;
                            square.getYellowSquare().setVisible(true);
                            if (!square.getPiece().getPlayer().getSet().contains(square)) {
                                for (Integer n : square.getPiece().AllowedSquares(square.getBoard(), square.getPiece(), square.getNum())) {
                                    for (Square s : square.getBoard()) {
                                        if (s.getNum() == n) {
                                            s.getGrayCircle().setVisible(true);
                                        }
                                    }
                                }
                            }
                            else {
                                square.getYellowSquare().setVisible(true);
                                lastSelected = this;
                            }
                        }
                    }
                }
            }









    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }

    public Square getSquare() {
        return square;
    }
}

class Square {
    Piece piece;
    static ArrayList<Square> board = new ArrayList<>();
    int num;
    JLabel grayCircle;
    JLabel yellowSquare;
    JLabel pieceIcon;
    Label THELabel;
    Piece firstPiece;

    Square(int num, Piece piece) {
        this.num = num;
        this.piece = piece;
        board.add(this);
        this.firstPiece = piece;
        this.setPieceIcon(new JLabel());
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public void setGrayCircle(JLabel grayCircle) {
        this.grayCircle = grayCircle;
    }

    public void setYellowSquare(JLabel yellowSquare) {
        this.yellowSquare = yellowSquare;
    }

    public void setTHELabel(Label THELabel) {
        this.THELabel = THELabel;
    }

    public void setPieceIcon(JLabel pieceIcon) {
        this.pieceIcon = pieceIcon;
    }

    public Piece getPiece() {
        return piece;
    }

    public int getNum() {
        return num;
    }

    public JLabel getGrayCircle() {
        return grayCircle;
    }

    public JLabel getYellowSquare() {
        return yellowSquare;
    }

    public Label getTHELabel() {
        return THELabel;
    }

    public ArrayList<Square> getBoard() {
        return board;
    }

    public JLabel getPieceIcon() {
        return pieceIcon;
    }
}

class Piece {
    boolean isPromoted;
    Square square;
    String name;
    Player player;
    JLabel icon = new JLabel();
    static ArrayList<Piece> allPieces = new ArrayList<>();

    ImageIcon BLACKicon;
    ImageIcon WHITEicon;

    Piece(String name, Square square, Player player) {
        this.name = name;
        this.square = square;
        this.isPromoted = false;
        this.player = player;
        allPieces.add(this);
    }

    public ImageIcon getBLACKicon() {
        return BLACKicon;
    }

    public ImageIcon getWHITEicon() {
        return WHITEicon;
    }

    public void setBLACKicon(ImageIcon BLACKicon) {
        this.BLACKicon = BLACKicon;
    }

    public void setWHITEicon(ImageIcon WHITEicon) {
        this.WHITEicon = WHITEicon;
    }

    void Move(ArrayList<Square> board, int from, int to) {
        Square fromSquare = null;
        Square toSquare = null;
        for (Square square1 : board) {
            if (square1.getNum() == from) {
                fromSquare = square1;
            }
        }
        for (Square square2 : board) {
            if (square2.getNum() == to) {
                toSquare = square2;
            }
        }

        assert toSquare != null;
        if (toSquare.getPiece() != null) {
            if (toSquare.getPiece().getName().equals("K") || toSquare.getPiece().getName().equals("k")) {
                assert fromSquare != null;
                fromSquare.getPiece().getPlayer().getWin().setVisible(true);
                fromSquare.getPieceIcon().setIcon(null);
                toSquare.getPieceIcon().setIcon(this.getIcon().getIcon());
                fromSquare.getPiece().getPlayer().setToMove(false);
            }
            else {
                toSquare.getPiece().getPlayer().setToMove(true);
                this.getPlayer().addToSet(this.getPlayer().getSet(), toSquare.getPiece());
                toSquare.getPiece().setPromoted(false);
                assert fromSquare != null;
                fromSquare.setPiece(null);
                fromSquare.getPieceIcon().setIcon(null);
                toSquare.getPieceIcon().setIcon(this.getIcon().getIcon());
                this.setSquare(toSquare);
                this.getPlayer().getNonPlayingPieces().add(toSquare.getPiece());
                toSquare.getPiece().getPlayer().getPlayingPieces().remove(toSquare.getPiece());
                toSquare.getPiece().setPlayer(this.getPlayer());
                toSquare.setPiece(this);
            }
        }
        else {
            assert fromSquare != null;
            fromSquare.setPiece(null);
            fromSquare.getPieceIcon().setIcon(null);
            toSquare.setPiece(this);
            toSquare.getPieceIcon().setIcon(this.getIcon().getIcon());
            this.setSquare(toSquare);
            for (Player player : Player.players) {
                if (!(player.getName().equals(this.getPlayer().getName()))) {
                    player.setToMove(true);
                }
            }
        }
        if (this.getPlayer().getName().equals("white")) {
            if (to % 10 == 4 || to % 10 == 5) {
                this.setPromoted(true);
            }
        }
        else {
            if (to % 10 == 1 || to % 10 == 2) {
                this.setPromoted(true);
            }
        }
        this.getPlayer().setToMove(false);
    }

    ArrayList<Integer> AllowedSquares(ArrayList<Square> board, Piece piece, int place) {
        ArrayList<Integer> squares = new ArrayList<>();
        switch (piece.getName().toUpperCase()) {
            case "K":
              squares.add(place + 10);
              squares.add(place - 10);
              squares.add(place + 1);
              squares.add(place - 1);
              squares.add(place + 11);
              squares.add(place - 11);
              squares.add(place + 9);
              squares.add(place - 9);

                squares.removeIf(num -> !(num / 10 < 6 && num / 10 > 0) || !(num % 10 < 6 && num % 10 > 0));
                ArrayList<Integer> gottaBeRemoved = new ArrayList<>();
                for (Integer num : squares) {
                    for (Square square : board) {
                        if (square.getNum() == num) {
                            if (square.getPiece() != null && piece.getPlayer().getPlayingPieces().contains(square.getPiece())) {
                                gottaBeRemoved.add(num);
                            }
                        }
                    }
                }
                for (Integer n : gottaBeRemoved) {
                    squares.remove(n);
                }
            break;

            case "G":
                if (piece.getPlayer().getName().equals("white")) {
                    squares.add(place + 1);
                    squares.add(place - 1);
                    squares.add(place + 10);
                    squares.add(place - 10);
                    squares.add(place + 11);
                    squares.add(place - 9);

                    squares.removeIf(num -> !(num / 10 < 6 && num / 10 > 0) || !(num % 10 < 6 && num % 10 > 0));
                    ArrayList<Integer> gottaBeRemoved1 = new ArrayList<>();
                    for (Integer num : squares) {
                        for (Square square : board) {
                            if (square.getNum() == num) {
                                if (square.getPiece() != null && piece.getPlayer().getPlayingPieces().contains(square.getPiece())) {
                                    gottaBeRemoved1.add(num);
                                }
                            }
                        }
                    }
                    for (Integer n : gottaBeRemoved1) {
                        squares.remove(n);
                    }
                }
                else {
                    squares.add(place + 1);
                    squares.add(place - 1);
                    squares.add(place + 10);
                    squares.add(place - 10);
                    squares.add(place - 11);
                    squares.add(place + 9);

                    squares.removeIf(num -> !(num / 10 < 6 && num / 10 > 0) || !(num % 10 < 6 && num % 10 > 0));
                    ArrayList<Integer> gottaBeRemoved1 = new ArrayList<>();
                    for (Integer num : squares) {
                        for (Square square : board) {
                            if (square.getNum() == num) {
                                if (square.getPiece() != null && piece.getPlayer().getPlayingPieces().contains(square.getPiece())) {
                                    gottaBeRemoved1.add(num);
                                }
                            }
                        }
                    }
                    for (Integer n : gottaBeRemoved1) {
                        squares.remove(n);
                    }
                }
            break;

            case "S":
                if (piece.isPromoted()) {
                    squares.add(place + 10);
                    squares.add(place - 10);
                    squares.add(place + 1);
                    squares.add(place - 1);
                    squares.add(place + 11);
                    squares.add(place - 11);
                    squares.add(place + 9);
                    squares.add(place - 9);

                    squares.add(place + 20);
                    squares.add(place - 20);
                    squares.add(place + 2);
                    squares.add(place - 2);
                    squares.add(place + 22);
                    squares.add(place - 22);
                    squares.add(place + 18);
                    squares.add(place - 18);

                    squares.removeIf(num -> !(num / 10 < 6 && num / 10 > 0) || !(num % 10 < 6 && num % 10 > 0));
                    ArrayList<Integer> gottaBeRemoved1 = new ArrayList<>();
                    for (Integer num : squares) {
                        for (Square square : board) {
                            if (square.getNum() == num) {
                                if (square.getPiece() != null && piece.getPlayer().getPlayingPieces().contains(square.getPiece())) {
                                    gottaBeRemoved1.add(num);
                                }
                            }
                        }
                    }
                    for (Integer n : gottaBeRemoved1) {
                        squares.remove(n);
                    }
                    ArrayList<Integer> gottaBeChecked = new ArrayList<>();
                    for (Integer num : squares) {
                        for (Square square : board) {
                            if (square.getNum() == num) {
                                if (square.getPiece() != null && !piece.getPlayer().getPlayingPieces().contains(square.getPiece())) {
                                    gottaBeChecked.add(num);
                                }
                            }
                        }
                    }
                    if (!squares.contains(place + 10) || gottaBeChecked.contains(place + 10)) {
                        Integer num = place + 20;
                        squares.remove(num);
                    }
                    if (!squares.contains(place - 10) || gottaBeChecked.contains(place - 10)) {
                        Integer num = place - 20;
                        squares.remove(num);
                    }
                    if (!squares.contains(place + 1) || gottaBeChecked.contains(place + 1)) {
                        Integer num = place + 2;
                        squares.remove(num);
                    }
                    if (!squares.contains(place - 1) || gottaBeChecked.contains(place - 1)) {
                        Integer num = place - 2;
                        squares.remove(num);
                    }
                    if (!squares.contains(place + 11) || gottaBeChecked.contains(place + 11)) {
                        Integer num = place + 22;
                        squares.remove(num);
                    }
                    if (!squares.contains(place - 11) || gottaBeChecked.contains(place - 11)) {
                        Integer num = place - 22;
                        squares.remove(num);
                    }
                    if (!squares.contains(place + 9) || gottaBeChecked.contains(place + 9)) {
                        Integer num = place + 18;
                        squares.remove(num);
                    }
                    if (!squares.contains(place - 9) || gottaBeChecked.contains(place - 9)) {
                        Integer num = place - 18;
                        squares.remove(num);
                    }
                }
                else {
                    if (piece.getPlayer().getName().equals("white")) {
                        squares.add(place + 11);
                        squares.add(place - 11);
                        squares.add(place + 9);
                        squares.add(place - 9);
                        squares.add(place + 1);

                        squares.removeIf(num -> !(num / 10 < 6 && num / 10 > 0) || !(num % 10 < 6 && num % 10 > 0));
                        ArrayList<Integer> gottaBeRemoved1 = new ArrayList<>();
                        for (Integer num : squares) {
                            for (Square square : board) {
                                if (square.getNum() == num) {
                                    if (square.getPiece() != null && piece.getPlayer().getPlayingPieces().contains(square.getPiece())) {
                                        gottaBeRemoved1.add(num);
                                    }
                                }
                            }
                        }
                        for (Integer n : gottaBeRemoved1) {
                            squares.remove(n);
                        }
                    }
                    else {
                        squares.add(place + 11);
                        squares.add(place - 11);
                        squares.add(place + 9);
                        squares.add(place - 9);
                        squares.add(place - 1);

                        squares.removeIf(num -> !(num / 10 < 6 && num / 10 > 0) || !(num % 10 < 6 && num % 10 > 0));
                        ArrayList<Integer> gottaBeRemoved1 = new ArrayList<>();
                        for (Integer num : squares) {
                            for (Square square : board) {
                                if (square.getNum() == num) {
                                    if (square.getPiece() != null && piece.getPlayer().getPlayingPieces().contains(square.getPiece())) {
                                        gottaBeRemoved1.add(num);
                                    }
                                }
                            }
                        }
                        for (Integer n : gottaBeRemoved1) {
                            squares.remove(n);
                        }
                    }
                }
            break;

            case "B":
                if (piece.isPromoted()) {
                    squares.add(place + 10);
                    squares.add(place - 10);
                    squares.add(place + 1);
                    squares.add(place - 1);
                    squares.add(place + 11);
                    squares.add(place - 11);
                    squares.add(place + 9);
                    squares.add(place - 9);

                    squares.add(place + 22);
                    squares.add(place - 22);
                    squares.add(place + 18);
                    squares.add(place - 18);

                    squares.add(place + 33);
                    squares.add(place - 33);
                    squares.add(place + 27);
                    squares.add(place - 27);

                    squares.add(place + 44);
                    squares.add(place - 44);
                    squares.add(place + 36);
                    squares.add(place - 36);

                    squares.removeIf(num -> !(num / 10 < 6 && num / 10 > 0) || !(num % 10 < 6 && num % 10 > 0));
                    ArrayList<Integer> gottaBeRemoved1 = new ArrayList<>();
                    for (Integer num : squares) {
                        for (Square square : board) {
                            if (square.getNum() == num) {
                                if (square.getPiece() != null && piece.getPlayer().getPlayingPieces().contains(square.getPiece())) {
                                    gottaBeRemoved1.add(num);
                                }
                            }
                        }
                    }
                    for (Integer n : gottaBeRemoved1) {
                        squares.remove(n);
                    }
                    ArrayList<Integer> gottaBeChecked = new ArrayList<>();
                    for (Integer num : squares) {
                        for (Square square : board) {
                            if (square.getNum() == num) {
                                if (square.getPiece() != null && !piece.getPlayer().getPlayingPieces().contains(square.getPiece())) {
                                    gottaBeChecked.add(num);
                                }
                            }
                        }
                    }
                    if (!squares.contains(place + 11) || gottaBeChecked.contains(place + 11)) {
                        Integer num = place + 22;
                        squares.remove(num);
                        num = place + 33;
                        squares.remove(num);
                        num = place + 44;
                        squares.remove(num);
                    }
                    if (!squares.contains(place + 22) || gottaBeChecked.contains(place + 22)) {
                        Integer num = place + 33;
                        squares.remove(num);
                        num = place + 44;
                        squares.remove(num);
                    }
                    if (!squares.contains(place + 33) || gottaBeChecked.contains(place + 33)) {
                        Integer num = place + 44;
                        squares.remove(num);
                    }

                    if (!squares.contains(place - 11) || gottaBeChecked.contains(place - 11)) {
                        Integer num = place - 22;
                        squares.remove(num);
                        num = place - 33;
                        squares.remove(num);
                        num = place - 44;
                        squares.remove(num);
                    }
                    if (!squares.contains(place - 22) || gottaBeChecked.contains(place - 22)) {
                        Integer num = place - 33;
                        squares.remove(num);
                        num = place - 44;
                        squares.remove(num);
                    }
                    if (!squares.contains(place - 33) || gottaBeChecked.contains(place - 33)) {
                        Integer num = place - 44;
                        squares.remove(num);
                    }

                    if (!squares.contains(place - 9) || gottaBeChecked.contains(place - 9)) {
                        Integer num = place - 18;
                        squares.remove(num);
                        num = place - 27;
                        squares.remove(num);
                        num = place - 36;
                        squares.remove(num);
                    }
                    if (!squares.contains(place - 18) || gottaBeChecked.contains(place - 18)) {
                        Integer num = place - 27;
                        squares.remove(num);
                        num = place - 36;
                        squares.remove(num);
                    }
                    if (!squares.contains(place - 27) || gottaBeChecked.contains(place - 27)) {
                        Integer num = place - 36;
                        squares.remove(num);
                    }

                    if (!squares.contains(place + 9) || gottaBeChecked.contains(place + 9)) {
                        Integer num = place + 18;
                        squares.remove(num);
                        num = place + 27;
                        squares.remove(num);
                        num = place + 36;
                        squares.remove(num);
                    }
                    if (!squares.contains(place + 18) || gottaBeChecked.contains(place + 18)) {
                        Integer num = place + 27;
                        squares.remove(num);
                        num = place + 36;
                        squares.remove(num);
                    }
                    if (!squares.contains(place + 27) || gottaBeChecked.contains(place + 27)) {
                        Integer num = place + 36;
                        squares.remove(num);
                    }
                }
                else {
                    if (piece.getPlayer().getName().equals("white")) {
                        squares.add(place + 11);
                        squares.add(place - 9);

                        squares.add(place + 22);
                        squares.add(place - 18);

                        squares.add(place + 33);
                        squares.add(place - 27);

                        squares.add(place + 44);
                        squares.add(place - 36);

                        squares.removeIf(num -> !(num / 10 < 6 && num / 10 > 0) || !(num % 10 < 6 && num % 10 > 0));
                        ArrayList<Integer> gottaBeRemoved1 = new ArrayList<>();
                        for (Integer num : squares) {
                            for (Square square : board) {
                                if (square.getNum() == num) {
                                    if (square.getPiece() != null && piece.getPlayer().getPlayingPieces().contains(square.getPiece())) {
                                        gottaBeRemoved1.add(num);
                                    }
                                }
                            }
                        }
                        for (Integer n : gottaBeRemoved1) {
                            squares.remove(n);
                        }

                        ArrayList<Integer> gottaBeChecked = new ArrayList<>();
                        for (Integer num : squares) {
                            for (Square square : board) {
                                if (square.getNum() == num) {
                                    if (square.getPiece() != null && !piece.getPlayer().getPlayingPieces().contains(square.getPiece())) {
                                        gottaBeChecked.add(num);
                                    }
                                }
                            }
                        }

                        if (!squares.contains(place + 11) || gottaBeChecked.contains(place + 11)) {
                            Integer num = place + 22;
                            squares.remove(num);
                            num = place + 33;
                            squares.remove(num);
                            num = place + 44;
                            squares.remove(num);
                        }
                        if (!squares.contains(place + 22) || gottaBeChecked.contains(place + 22)) {
                            Integer num = place + 33;
                            squares.remove(num);
                            num = place + 44;
                            squares.remove(num);
                        }
                        if (!squares.contains(place + 33) || gottaBeChecked.contains(place + 33)) {
                            Integer num = place + 44;
                            squares.remove(num);
                        }

                        if (!squares.contains(place - 9) || gottaBeChecked.contains(place - 9)) {
                            Integer num = place - 18;
                            squares.remove(num);
                            num = place - 27;
                            squares.remove(num);
                            num = place - 36;
                            squares.remove(num);
                        }
                        if (!squares.contains(place - 18) || gottaBeChecked.contains(place - 18)) {
                            Integer num = place - 27;
                            squares.remove(num);
                            num = place - 36;
                            squares.remove(num);
                        }
                        if (!squares.contains(place - 27) || gottaBeChecked.contains(place - 27)) {
                            Integer num = place - 36;
                            squares.remove(num);
                        }
                    }
                    else {
                        squares.add(place - 11);
                        squares.add(place + 9);

                        squares.add(place - 22);
                        squares.add(place + 18);

                        squares.add(place - 33);
                        squares.add(place + 27);

                        squares.add(place - 44);
                        squares.add(place + 36);

                        squares.removeIf(num -> !(num / 10 < 6 && num / 10 > 0) || !(num % 10 < 6 && num % 10 > 0));
                        ArrayList<Integer> gottaBeRemoved1 = new ArrayList<>();
                        for (Integer num : squares) {
                            for (Square square : board) {
                                if (square.getNum() == num) {
                                    if (square.getPiece() != null && piece.getPlayer().getPlayingPieces().contains(square.getPiece())) {
                                        gottaBeRemoved1.add(num);
                                    }
                                }
                            }
                        }
                        for (Integer n : gottaBeRemoved1) {
                            squares.remove(n);
                        }

                        ArrayList<Integer> gottaBeChecked = new ArrayList<>();
                        for (Integer num : squares) {
                            for (Square square : board) {
                                if (square.getNum() == num) {
                                    if (square.getPiece() != null && !piece.getPlayer().getPlayingPieces().contains(square.getPiece())) {
                                        gottaBeChecked.add(num);
                                    }
                                }
                            }
                        }

                        if (!squares.contains(place - 11) || gottaBeChecked.contains(place - 11)) {
                            Integer num = place - 22;
                            squares.remove(num);
                            num = place - 33;
                            squares.remove(num);
                            num = place - 44;
                            squares.remove(num);
                        }
                        if (!squares.contains(place - 22) || gottaBeChecked.contains(place - 22)) {
                            Integer num = place - 33;
                            squares.remove(num);
                            num = place - 44;
                            squares.remove(num);
                        }
                        if (!squares.contains(place - 33) || gottaBeChecked.contains(place - 33)) {
                            Integer num = place - 44;
                            squares.remove(num);
                        }

                        if (!squares.contains(place + 9) || gottaBeChecked.contains(place + 9)) {
                            Integer num = place + 18;
                            squares.remove(num);
                            num = place + 27;
                            squares.remove(num);
                            num = place + 36;
                            squares.remove(num);
                        }
                        if (!squares.contains(place + 18) || gottaBeChecked.contains(place + 18)) {
                            Integer num = place + 27;
                            squares.remove(num);
                            num = place + 36;
                            squares.remove(num);
                        }
                        if (!squares.contains(place + 27) || gottaBeChecked.contains(place + 27)) {
                            Integer num = place + 36;
                            squares.remove(num);
                        }
                    }
                }
            break;

            case "L":
                if (piece.isPromoted()) {
                    squares.add(place + 10);
                    squares.add(place - 10);
                    squares.add(place + 1);
                    squares.add(place - 1);

                    squares.add(place + 20);
                    squares.add(place - 20);
                    squares.add(place + 2);
                    squares.add(place - 2);

                    squares.add(place + 30);
                    squares.add(place - 30);
                    squares.add(place + 3);
                    squares.add(place - 3);

                    squares.add(place + 40);
                    squares.add(place - 40);
                    squares.add(place + 4);
                    squares.add(place - 4);

                    squares.removeIf(num -> !(num / 10 < 6 && num / 10 > 0) || !(num % 10 < 6 && num % 10 > 0));
                    ArrayList<Integer> gottaBeRemoved1 = new ArrayList<>();
                    for (Integer num : squares) {
                        for (Square square : board) {
                            if (square.getNum() == num) {
                                if (square.getPiece() != null && piece.getPlayer().getPlayingPieces().contains(square.getPiece())) {
                                    gottaBeRemoved1.add(num);
                                }
                            }
                        }
                    }
                    for (Integer n : gottaBeRemoved1) {
                        squares.remove(n);
                    }
                    ArrayList<Integer> gottaBeChecked = new ArrayList<>();
                    for (Integer num : squares) {
                        for (Square square : board) {
                            if (square.getNum() == num) {
                                if (square.getPiece() != null && !piece.getPlayer().getPlayingPieces().contains(square.getPiece())) {
                                    gottaBeChecked.add(num);
                                }
                            }
                        }
                    }
                    if (!squares.contains(place + 10) || gottaBeChecked.contains(place + 10)) {
                        Integer num = place + 20;
                        squares.remove(num);
                        num = place + 30;
                        squares.remove(num);
                        num = place + 40;
                        squares.remove(num);
                    }
                    if (!squares.contains(place + 20) || gottaBeChecked.contains(place + 20)) {
                        Integer num = place + 30;
                        squares.remove(num);
                        num = place + 40;
                        squares.remove(num);
                    }
                    if (!squares.contains(place + 30) || gottaBeChecked.contains(place + 30)) {
                        Integer num = place + 40;
                        squares.remove(num);
                    }

                    if (!squares.contains(place - 10) || gottaBeChecked.contains(place - 10)) {
                        Integer num = place - 20;
                        squares.remove(num);
                        num = place - 30;
                        squares.remove(num);
                        num = place - 40;
                        squares.remove(num);
                    }
                    if (!squares.contains(place - 20) || gottaBeChecked.contains(place - 20)) {
                        Integer num = place - 30;
                        squares.remove(num);
                        num = place - 40;
                        squares.remove(num);
                    }
                    if (!squares.contains(place - 30) || gottaBeChecked.contains(place - 30)) {
                        Integer num = place - 40;
                        squares.remove(num);
                    }

                    if (!squares.contains(place - 1) || gottaBeChecked.contains(place - 1)) {
                        Integer num = place - 2;
                        squares.remove(num);
                        num = place - 3;
                        squares.remove(num);
                        num = place - 4;
                        squares.remove(num);
                    }
                    if (!squares.contains(place - 2) || gottaBeChecked.contains(place - 2)) {
                        Integer num = place - 3;
                        squares.remove(num);
                        num = place - 4;
                        squares.remove(num);
                    }
                    if (!squares.contains(place - 3) || gottaBeChecked.contains(place - 3)) {
                        Integer num = place - 4;
                        squares.remove(num);
                    }

                    if (!squares.contains(place + 1) || gottaBeChecked.contains(place + 1)) {
                        Integer num = place + 2;
                        squares.remove(num);
                        num = place + 3;
                        squares.remove(num);
                        num = place + 4;
                        squares.remove(num);
                    }
                    if (!squares.contains(place + 2) || gottaBeChecked.contains(place + 2)) {
                        Integer num = place + 3;
                        squares.remove(num);
                        num = place + 4;
                        squares.remove(num);
                    }
                    if (!squares.contains(place + 3) || gottaBeChecked.contains(place + 3)) {
                        Integer num = place + 4;
                        squares.remove(num);
                    }
                }
                else {
                    if (piece.getPlayer().getName().equals("white")) {
                        squares.add(place + 1);
                        squares.add(place + 2);
                        squares.add(place + 3);
                        squares.add(place + 4);

                        squares.removeIf(num -> !(num / 10 < 6 && num / 10 > 0) || !(num % 10 < 6 && num % 10 > 0));
                        ArrayList<Integer> gottaBeRemoved1 = new ArrayList<>();
                        for (Integer num : squares) {
                            for (Square square : board) {
                                if (square.getNum() == num) {
                                    if (square.getPiece() != null && piece.getPlayer().getPlayingPieces().contains(square.getPiece())) {
                                        gottaBeRemoved1.add(num);
                                    }
                                }
                            }
                        }
                        for (Integer n : gottaBeRemoved1) {
                            squares.remove(n);
                        }
                        ArrayList<Integer> gottaBeChecked = new ArrayList<>();
                        for (Integer num : squares) {
                            for (Square square : board) {
                                if (square.getNum() == num) {
                                    if (square.getPiece() != null && !piece.getPlayer().getPlayingPieces().contains(square.getPiece())) {
                                        gottaBeChecked.add(num);
                                    }
                                }
                            }
                        }
                        if (!squares.contains(place + 1) || gottaBeChecked.contains(place + 1)) {
                            Integer num = place + 2;
                            squares.remove(num);
                            num = place + 3;
                            squares.remove(num);
                            num = place + 4;
                            squares.remove(num);
                        }
                        if (!squares.contains(place + 2) || gottaBeChecked.contains(place + 2)) {
                            Integer num = place + 3;
                            squares.remove(num);
                            num = place + 4;
                            squares.remove(num);
                        }
                        if (!squares.contains(place + 3) || gottaBeChecked.contains(place + 3)) {
                            Integer num = place + 4;
                            squares.remove(num);
                        }
                    }
                    else {
                        squares.add(place - 1);
                        squares.add(place - 2);
                        squares.add(place - 3);
                        squares.add(place - 4);

                        squares.removeIf(num -> !(num / 10 < 6 && num / 10 > 0) || !(num % 10 < 6 && num % 10 > 0));
                        ArrayList<Integer> gottaBeRemoved1 = new ArrayList<>();
                        for (Integer num : squares) {
                            for (Square square : board) {
                                if (square.getNum() == num) {
                                    if (square.getPiece() != null && piece.getPlayer().getPlayingPieces().contains(square.getPiece())) {
                                        gottaBeRemoved1.add(num);
                                    }
                                }
                            }
                        }
                        for (Integer n : gottaBeRemoved1) {
                            squares.remove(n);
                        }
                        ArrayList<Integer> gottaBeChecked = new ArrayList<>();
                        for (Integer num : squares) {
                            for (Square square : board) {
                                if (square.getNum() == num) {
                                    if (square.getPiece() != null && !piece.getPlayer().getPlayingPieces().contains(square.getPiece())) {
                                        gottaBeChecked.add(num);
                                    }
                                }
                            }
                        }
                        if (!squares.contains(place - 1) || gottaBeChecked.contains(place - 1)) {
                            Integer num = place - 2;
                            squares.remove(num);
                            num = place - 3;
                            squares.remove(num);
                            num = place - 4;
                            squares.remove(num);
                        }
                        if (!squares.contains(place - 2) || gottaBeChecked.contains(place - 2)) {
                            Integer num = place - 3;
                            squares.remove(num);
                            num = place - 4;
                            squares.remove(num);
                        }
                        if (!squares.contains(place - 3) || gottaBeChecked.contains(place - 3)) {
                            Integer num = place - 4;
                            squares.remove(num);
                        }
                    }
                }
            break;

            case "P":
                if (piece.isPromoted()) {
                    if (piece.getPlayer().getName().equals("white")) {
                        squares.add(place + 1);
                        squares.add(place - 1);
                        squares.add(place + 10);
                        squares.add(place - 10);
                        squares.add(place + 11);
                        squares.add(place - 9);

                        squares.removeIf(num -> !(num / 10 < 6 && num / 10 > 0) || !(num % 10 < 6 && num % 10 > 0));
                        ArrayList<Integer> gottaBeRemoved1 = new ArrayList<>();
                        for (Integer num : squares) {
                            for (Square square : board) {
                                if (square.getNum() == num) {
                                    if (square.getPiece() != null && piece.getPlayer().getPlayingPieces().contains(square.getPiece())) {
                                        gottaBeRemoved1.add(num);
                                    }
                                }
                            }
                        }
                        for (Integer n : gottaBeRemoved1) {
                            squares.remove(n);
                        }
                    }
                    else {
                        squares.add(place + 1);
                        squares.add(place - 1);
                        squares.add(place + 10);
                        squares.add(place - 10);
                        squares.add(place - 11);
                        squares.add(place + 9);

                        squares.removeIf(num -> !(num / 10 < 6 && num / 10 > 0) || !(num % 10 < 6 && num % 10 > 0));
                        ArrayList<Integer> gottaBeRemoved1 = new ArrayList<>();
                        for (Integer num : squares) {
                            for (Square square : board) {
                                if (square.getNum() == num) {
                                    if (square.getPiece() != null && piece.getPlayer().getPlayingPieces().contains(square.getPiece())) {
                                        gottaBeRemoved1.add(num);
                                    }
                                }
                            }
                        }
                        for (Integer n : gottaBeRemoved1) {
                            squares.remove(n);
                        }
                    }
                }
                else {
                    if (piece.getPlayer().getName().equals("white")) {
                        squares.add(place + 1);

                        squares.removeIf(num -> !(num / 10 < 6 && num / 10 > 0) || !(num % 10 < 6 && num % 10 > 0));
                        ArrayList<Integer> gottaBeRemoved1 = new ArrayList<>();
                        for (Integer num : squares) {
                            for (Square square : board) {
                                if (square.getNum() == num) {
                                    if (square.getPiece() != null && piece.getPlayer().getPlayingPieces().contains(square.getPiece())) {
                                        gottaBeRemoved1.add(num);
                                    }
                                }
                            }
                        }
                        for (Integer n : gottaBeRemoved1) {
                            squares.remove(n);
                        }
                    }
                    else {
                        squares.add(place - 1);

                        squares.removeIf(num -> !(num / 10 < 6 && num / 10 > 0) || !(num % 10 < 6 && num % 10 > 0));
                        ArrayList<Integer> gottaBeRemoved1 = new ArrayList<>();
                        for (Integer num : squares) {
                            for (Square square : board) {
                                if (square.getNum() == num) {
                                    if (square.getPiece() != null && piece.getPlayer().getPlayingPieces().contains(square.getPiece())) {
                                        gottaBeRemoved1.add(num);
                                    }
                                }
                            }
                        }
                        for (Integer n : gottaBeRemoved1) {
                            squares.remove(n);
                        }
                    }
                }
            break;
        }
        return squares;
    }

    public void setPromoted(boolean promoted) {
        isPromoted = promoted;
    }

    public void setSquare(Square square) {
        this.square = square;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public boolean isPromoted() {
        return isPromoted;
    }

    public String getName() {
        return name;
    }

    public Player getPlayer() {
        return player;
    }

    public JLabel getIcon() {
        return icon;
    }
}

class Player {
    ArrayList<Piece> playingPieces;
    ArrayList<Piece> nonPlayingPieces = new ArrayList<>();
    ArrayList<Square> set = new ArrayList<>();
    static ArrayList<Player> players = new ArrayList<>();
    String name;
    boolean isToMove;
    JLabel win = new JLabel();
    static Player firstPlayer;
    static Player secondPlayer;

    Player(ArrayList<Piece> playingPieces, String name) {
        this.playingPieces = playingPieces;
        this.isToMove = false;
        this.name = name;
        players.add(this);
    }

    public void addToSet(ArrayList<Square> set, Piece piece) {
        for (Square square : set) {
            if (square.getPieceIcon().getIcon() == null) {
                square.setPiece(piece);
                piece.getIcon().setIcon(piece.getIcon().getIcon() == piece.getBLACKicon() ? piece.getWHITEicon() : piece.getBLACKicon());
                square.getPieceIcon().setIcon(piece.getIcon().getIcon());
                break;
            }
        }
    }

    public void setToMove(boolean toMove) {
        isToMove = toMove;
    }

    public void setSet(ArrayList<Square> set) {
        this.set = set;
    }

    public void setWin(JLabel win) {
        this.win = win;
    }

    public ArrayList<Piece> getPlayingPieces() {
        return playingPieces;
    }

    public ArrayList<Piece> getNonPlayingPieces() {
        return nonPlayingPieces;
    }

    public String getName() {
        return name;
    }

    public boolean isToMove() {
        return isToMove;
    }

    public ArrayList<Square> getSet() {
        return set;
    }

    public JLabel getWin() {
        return win;
    }

    public void setPlayingPieces(ArrayList<Piece> playingPieces) {
        this.playingPieces = playingPieces;
    }

    public void setNonPlayingPieces(ArrayList<Piece> nonPlayingPieces) {
        this.nonPlayingPieces = nonPlayingPieces;
    }
}