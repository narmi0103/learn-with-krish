package EditDocument;
import java.util.ArrayList;
	/**
	 * Originator
	 */

	public class textField {
	    ArrayList<Document> documents = new ArrayList<>();
	 
	    public ArrayList<Document> getDocuments() {
	        return (ArrayList) documents.clone();
	
	    }
	
	    public Memento save() {
	        return new Memento(getDocuments());
	    }
	
	    public void revert(Memento Memento) {
	    	documents = Memento.getDocuments();
	    }
	
	    @Override
	    public String toString() {
	        return "textField{" + "layers" + documents + '}';
	    }
	
	    static class Memento {
	        ArrayList<Document> documents;
	
	        public Memento(ArrayList<Document> documents) {
	            this.documents = documents;
	        }
	
	        private ArrayList<Document> getDocuments() {
	            return documents;
	        }
	
	    }

		public void addDesign(Document document) {
			documents.add(document);
			
		}
    
    }
	
	
