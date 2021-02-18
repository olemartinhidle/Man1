
package editor;

import editor.display.CharacterDisplay;

import java.util.LinkedList;


/**
 * This class represents the document being edited. Using a 2d array
 * to hold the document content is probably not a very good choice.
 * Fixing this class is the main focus of the exercise. In addition to
 * designing a better data model, you must add methods to do at least
 * basic editing: write and delete text, and moving the cursor
 *
 * Implement the following commands
 *
 * @author evenal
 */


/** Forsøkte bruke inspirasjon fra repo, men fikk fremdeles ikke til å implimentere
 *  for events som dette systemt legger opp til
 */


public class Document {

    private LinkedList<LinkedList> list = new LinkedList();
    private int cursorRow;
    private int cursorCol;
    private CharacterDisplay display;

    public Document(CharacterDisplay display) {
        cursorCol = cursorRow = 0;
        this.display = display;
        startList();

    }

    private void startList() {
        // should be called at the end of the functionality
        // and should update the display
            // Create 20 rows to the board
            for (int i = 0; i < 20; i++) {
                list.add(new LinkedList<c>());
            }

            // First access the outer list, then fill the inner lists with Chars.
            for (int i = 0; i < 20; i++) {
                LinkedList row = list.get(i);

                for (int j = 0; j < 40; j++) {
                    row.add(j, ' ');
                }
            }

    }

    /*
     * The following methods are called from the actions. Decide on
     * the data structure(s) for Document first. Then finish these
     * methods
     */

    public void insertLine() {
        list.get(cursorRow).add(cursorCol, c);

        // Removes a char from the list
        list.get(cursorRow).removeLast();


        // Updates the list with displayable characters
        for(int i= cursorCol; i < 40; i++){
            display.displayChar((Character) list.get(cursorRow).get(i), cursorRow, i);
        }

        display.displayCursor(' ', cursorRow, cursorCol);

        // If cursor on the end of column, increment the row.
        if (cursorCol == 39 && cursorRow == 19) {
        } else {
            cursorCol++;
            if (cursorCol >= CharacterDisplay.WIDTH) {
                cursorCol = 0;
                cursorRow++;
            }
        }
    }


    public char deleteNext() {
        // Adds a char to the list
        list.get(cursorRow).set(cursorCol, ' ');


        for (int i = cursorCol; i < 40; i++) {
            display.displayChar((Character) list.get(cursorRow).get(i), cursorRow, i);
        }

        display.displayCursor(' ', cursorRow, cursorCol);

        // Cursor logic
        if (cursorCol == 0 && cursorRow == 0) {

        } else if (cursorCol == 0 && cursorRow >= 0) {
            cursorCol = 39;
            cursorRow--;
        } else {
            cursorCol--;
        }
        display.displayCursor(' ', cursorRow, cursorCol);
    }

    public char deletePrev() {
        return deletePrev();
    }

    public void moveCursor(String direction) {

    }

    private void updateDisplay(int line) {
        // for all visible characterso
        // show them in the rightplace
        display.displayChar(c, line, column);

        // and make the cursor stand out a little
        display.displayCursor(c, line, column);
    }

    public void print() {
    }
}