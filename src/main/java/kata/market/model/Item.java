package kata.market.model;

import io.vavr.Tuple;
import io.vavr.Tuple2;
public class Item {
    private boolean byWeight;
    private Tuple2<Integer, Float> reductionValueByNumber = Tuple.of(null, null);
    private String name;
    private int unitaryPrice;
    
    
    public Item(boolean byWeight, Tuple2<Integer, Float> reductionValueByNumber, String name, int unitaryPrice) {
		super();
		this.byWeight = byWeight;
		this.reductionValueByNumber = reductionValueByNumber;
		this.name = name;
		this.unitaryPrice = unitaryPrice;
	}

	public boolean isByWeight(){
    	return byWeight;
    }
    
    public int getUnitaryPrice(){
    	return unitaryPrice;
    }
    public void setUnitaryPrice(int unitaryPrice){
    	this.unitaryPrice = unitaryPrice;
    }
    public Tuple2<Integer, Float> getReductionValueByNumber(){
    	return reductionValueByNumber;
    }
    public void setReductionValueByNumber(Tuple2<Integer, Float> reductionValueByNumber){
    	this.reductionValueByNumber = reductionValueByNumber;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (byWeight ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((reductionValueByNumber == null) ? 0 : reductionValueByNumber.hashCode());
		result = prime * result + unitaryPrice;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (byWeight != other.byWeight)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (reductionValueByNumber == null) {
			if (other.reductionValueByNumber != null)
				return false;
		} else if (!reductionValueByNumber.equals(other.reductionValueByNumber))
			return false;
		if (unitaryPrice != other.unitaryPrice)
			return false;
		return true;
	}
    
    
}
