package EditDocument;

import java.util.Stack;

public class CareTaker {

  Stack<textField.Memento> history = new Stack<>();

  public void save(textField textField) {
    history.push(textField.save());
  }

  public void revert(textField textField) {
    if (!history.isEmpty()) {
    	textField.revert(history.pop());
    } else {
      System.out.println("Cannot Undo");
    }
  }
}
