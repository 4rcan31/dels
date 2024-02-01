package com.siman.creditos.entity;


public class GenericEntity {
	
	public String getId() {
		return null;
	}

	@Override
    public int hashCode() {
        return (getId() != null) 
            ? (getClass().getSimpleName().hashCode() + getId().hashCode())
            : super.hashCode();
    }

	@Override
    public boolean equals(Object other) {
		IConvertible otherClean = (IConvertible) other;
        return (other != null && getId() != null
                && other.getClass().isAssignableFrom(getClass()) 
                && getClass().isAssignableFrom(other.getClass())) 
            ? getId().equals( otherClean.getId() )
            : (other == this);
//		if(other==null) return false;
//		IConvertible otherClean = (IConvertible) other;
//		return this.getId().equals(otherClean.getId());
    }
	
	@Override
	public String toString() {
		return String.format("%s[id=%d]", getClass().getSimpleName(), getId());
	}
	
}
