package models;

public class Waste extends FrenchCardStack{
	@Override
	public String toString(){
		if(this.cardStack.isEmpty()){
			return "<vacio>";
		}else{
			return super.toString();
		}
	}

}
