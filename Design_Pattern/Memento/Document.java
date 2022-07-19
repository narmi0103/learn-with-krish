package EditDocument;


public class Document {
	
    String option;

    public Document(String option) {
        this.option = option;

    }

	@Override
	public String toString() {
		return "Document [option=" + option +  '\'' +  "]";
	}


    
}
