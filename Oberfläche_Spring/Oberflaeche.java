
/*
 * ============================================================================
 *  Oberflaeche.java  —  A simple Swing user interface
 * ============================================================================
 *
 *  This program recreates the window from the textbook figures:
 *
 *     - a label "Eingabe"  (Input)         (JLabel)
 *     - a single-line input field          (JTextField)
 *     - a multi-line text area             (JTextArea)
 *     - a button "Druecken"  (Press)       (JButton)
 *
 *  When the button is clicked, the line "Button gedrueckt" (Button pressed)
 *  is appended to the text area — exactly like in Fig. 17.
 *
 *  NOTE: The visible German UI texts (window title, label, button caption)
 *  are kept as-is so the program looks like the screenshots. Only the
 *  COMMENTS are in English.
 *
 *  ---------------------------------------------------------------------------
 *  HOW TO RUN:
 *  ---------------------------------------------------------------------------
 *    1) Save this file as:  Oberflaeche.java
 *       The file name MUST match the public class name!
 *
 *    2) Compile it in a terminal:
 *          javac Oberflaeche.java
 *
 *    3) Run it:
 *          java Oberflaeche
 *
 *  Requirement: JDK 8 or newer. Swing is already part of the JDK,
 *  so you do NOT need to install anything extra.
 * ============================================================================
 */

// "import" pulls in ready-made classes that we want to use.

import javax.swing.*;
import java.awt.*;

// A public class must live in a file with the same name.
public class Oberflaeche {

    // ------------------------------------------------------------------
    //  FIELDS (class attributes)
    //
    //  We need to access these two components LATER (namely inside the
    //  click handler). That is why they are stored as fields of the class
    //  and not as local variables inside the constructor.
    // ------------------------------------------------------------------
    private JTextField eingabeFeld;   // the input field
    private JTextArea textBereich;   // the text area

    /**
     * Constructor: builds the whole graphical user interface.
     */
    public Oberflaeche() {

        // ==============================================================
        // 1) THE WINDOW
        // ==============================================================
        // JFrame is the main window: title bar, border, close (X) button.
        JFrame fenster = new JFrame("Oberflaeche mit Widgets");

        // What should happen when the window is closed? -> exit the program.
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // The LAYOUT MANAGER decides HOW components are arranged.
        // BorderLayout splits the window into 5 regions:
        //   NORTH (top), SOUTH (bottom), WEST (left), EAST (right), CENTER.
        // The numbers (8, 8) are the gap in pixels between the regions.
        fenster.setLayout(new BorderLayout(8, 8));

        // ==============================================================
        // 2) TOP AREA: label + input field
        // ==============================================================
        // A JPanel is a container used to group components together.
        // Here we put the label and the input field into one row.
        JPanel oben = new JPanel(new BorderLayout(8, 0));

        JLabel label = new JLabel("Eingabe");            // a caption
        eingabeFeld = new JTextField("Beispieltext");   // single-line input

        oben.add(label, BorderLayout.WEST);    // label on the far left
        oben.add(eingabeFeld, BorderLayout.CENTER);  // field fills the rest

        // ==============================================================
        // 3) CENTER: multi-line text area
        // ==============================================================
        // "\n" is a line break.
        textBereich = new JTextArea("Beispieltext\nueber mehrere\nZellen");

        // PRACTICAL TIP: wrap the text area in a JScrollPane. Scroll bars
        // then appear automatically when the text becomes too long.
        JScrollPane scroll = new JScrollPane(textBereich);

        // ==============================================================
        // 4) BOTTOM AREA: the button
        // ==============================================================
        JButton knopf = new JButton("Druecken");   // the button

        // FlowLayout centers the button nicely in the middle.
        JPanel unten = new JPanel(new FlowLayout(FlowLayout.CENTER));
        unten.add(knopf);

        // ==============================================================
        // 5) EVENT: what happens on a click?
        // ==============================================================
        // addActionListener registers a "listener" for the click.
        // Written here as a short lambda (modern style):  e -> { ... }
        knopf.addActionListener(e -> {
            // append() adds text to the end of the text area.
            textBereich.append("\nButton gedrueckt");
        });

        /*  FOR COMPARISON — the same thing WITHOUT a lambda
         *  (the classic, older style you often see in textbooks):
         *
         *  knopf.addActionListener(new ActionListener() {
         *      @Override
         *      public void actionPerformed(ActionEvent e) {
         *          textBereich.append("\nButton gedrueckt");
         *      }
         *  });
         *
         *  (For that you would also need these imports at the top:
         *      import java.awt.event.ActionEvent;
         *      import java.awt.event.ActionListener; )
         */

        // ==============================================================
        // 6) PUT EVERYTHING TOGETHER
        // ==============================================================
        fenster.add(oben, BorderLayout.NORTH);   // top
        fenster.add(scroll, BorderLayout.CENTER);  // center
        fenster.add(unten, BorderLayout.SOUTH);   // bottom

        // ==============================================================
        // 7) SHOW THE WINDOW
        // ==============================================================
        fenster.setSize(420, 260);             // size (width, height)
        fenster.setLocationRelativeTo(null);   // center the window on screen
        fenster.setVisible(true);              // IMPORTANT: otherwise it stays invisible!
    }

    /**
     * main = the entry point. The program starts here.
     */
    public static void main(String[] args) {

        // IMPORTANT RULE:
        // Always create Swing interfaces on the "Event Dispatch Thread" (EDT).
        // SwingUtilities.invokeLater(...) makes sure of exactly that.
        // This keeps the UI stable and prevents it from freezing.
        SwingUtilities.invokeLater(() -> new Oberflaeche());
    }
}
