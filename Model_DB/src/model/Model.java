/**
 * 
 */
package model;

/**
 * @author NurAfeeqah
 *
 */
public class Model {
	
	private int modelID;
	private String modelName;
	private String modelAuthor;
	private String modelDate;
	
	/**
	 * default constructor
	 */
	public Model() {
		this.modelID = 1;
		this.modelName = "No Name";
		this.modelAuthor = "No Author";
		this.modelDate = "No Date";
	}
	
	/**
	 * @param modelID
	 * @param modelName
	 * @param modelAuthor
	 * @param modelDate
	 */
	public Model(int modelID, String modelName, String modelAuthor,
			String modelDate) {
		this.modelID = modelID;
		this.modelName = modelName;
		this.modelAuthor = modelAuthor;
		this.modelDate = modelDate;
	}

	/**
	 * @return the modelID
	 */
	public int getModelID() {
		return modelID;
	}

	/**
	 * @param modelID the modelID to set
	 */
	public void setModelID(int modelID) {
		this.modelID = modelID;
	}

	/**
	 * @return the modelName
	 */
	public String getModelName() {
		return modelName;
	}

	/**
	 * @param modelName the modelName to set
	 */
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	/**
	 * @return the modelAuthor
	 */
	public String getModelAuthor() {
		return modelAuthor;
	}

	/**
	 * @param modelAuthor the modelAuthor to set
	 */
	public void setModelAuthor(String modelAuthor) {
		this.modelAuthor = modelAuthor;
	}

	/**
	 * @return the modelDate
	 */
	public String getModelDate() {
		return modelDate;
	}

	/**
	 * @param modelDate the modelDate to set
	 */
	public void setModelDate(String modelDate) {
		this.modelDate = modelDate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Model [modelID=" + modelID + ", modelName=" + modelName
				+ ", modelAuthor=" + modelAuthor + ", modelDate=" + modelDate
				+ "]";
	}
	
	
	
	

	
}
