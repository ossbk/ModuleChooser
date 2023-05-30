package model;

import java.util.Objects;


public class Module implements Comparable<Module> {
	
	private String moduleNumber;
	private String moduleName;
	private int moduleCredits;
	private boolean compulsory;
	private Schedule delivery;
	
	public Module(String moduleNumber, String moduleName, int moduleCredits, boolean compulsory, Schedule delivery) {
		this.moduleNumber = moduleNumber;
		this.moduleName = moduleName;
		this.moduleCredits = moduleCredits;
		this.compulsory = compulsory;
		this.delivery = delivery;
	}

	public String getModuleNumber() {
		return moduleNumber;
	}

	public void setModuleNumber(String moduleNumber) {
		this.moduleNumber = moduleNumber;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public int getModuleCredits() {
		return moduleCredits;
	}
	
	public void setModuleCredits(int moduleCredits) {
		this.moduleCredits = moduleCredits;
	}

	public boolean isCompulsory() {
		return compulsory;
	}
	
	public void setCompulsory(boolean compulsory) {
		this.compulsory = compulsory;
	}
	
	public Schedule getDelivery() {
		return delivery;
	}

	public void setDelivery(Schedule delivery) {
		this.delivery = delivery;
	}
	
	
	@Override
	public String toString() {
		//a non-standard toString that simply returns the module code and name,
		//so as to assist in displaying modules correctly in a ListView<Module> in the view
		//-Note- you may customise this if you wish to do so.
		return moduleNumber + " : " + moduleName;
	}
	
	public String actualToString() {
		return "Module:[moduleNumber=" + moduleNumber + ", moduleName=" + moduleName + 
				", moduleCredits=" + moduleCredits + ", compulsory=" + compulsory + ", delivery=" + delivery + "]";
	}
	
	@Override
	public int compareTo(Module other) {
		int result = this.moduleNumber.compareTo(other.moduleNumber);
		
		if (result == 0) {
			result = Integer.compare(this.moduleCredits, other.moduleCredits);
			
			if (result == 0) {
				result = Boolean.compare(other.compulsory, this.compulsory);
				
				if (result == 0) {
					result = this.moduleName.compareTo(other.moduleName);
					
					if (result == 0) {
						result = this.delivery.compareTo(other.delivery);
					}
				}
				
			}
		}
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() != this.getClass())
			return false;
		
		Module other = (Module) obj;
		
		return this.compulsory == other.compulsory && this.moduleCredits == other.moduleCredits &&
				this.moduleNumber.equals(other.moduleNumber) && this.moduleName.equals(other.moduleName) &&
				this.delivery.equals(other.delivery);
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(compulsory, moduleCredits, moduleNumber, moduleName, delivery);
	}
	
	
}
