package EditDocument;

public class Editor {
	
    public static void main(String[] args) {

        CareTaker careTaker = new CareTaker();
        textField textField = new textField(); 

        textField.addDesign(new Document("Bold"));
        textField.addDesign(new Document("italic"));
        careTaker.save(textField);
        System.out.println(textField);

        textField.addDesign(new Document("alignment"));
        careTaker.save(textField);
        System.out.println(textField);

        textField.addDesign(new Document("Underline"));
        careTaker.save(textField);
        System.out.println(textField);

        careTaker.revert(textField);
        System.out.println(textField);


        textField.addDesign(new Document("Color"));
      // careTaker.save(textField);
        System.out.println(textField);

        careTaker.revert(textField);
        System.out.println(textField);

        careTaker.revert(textField);
        System.out.println(textField);


    }
}
