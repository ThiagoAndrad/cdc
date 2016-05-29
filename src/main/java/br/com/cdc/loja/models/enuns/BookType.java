package br.com.cdc.loja.models.enuns;

public enum BookType {
	
	EBOOK("E-book"), 
	PRINTED("Impresso"), 
	COMBO("Combo");

	private String nameType;
	
	BookType(String nameType){
		this.nameType = nameType;
	}

	public String getNameType() {
		return nameType;
	}
}
