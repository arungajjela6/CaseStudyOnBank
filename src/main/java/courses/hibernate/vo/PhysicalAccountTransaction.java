package courses.hibernate.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Domain object representing a Physical Account Transaction
 */
@Entity
@Table(name="physicalaccounttransaction")
public class PhysicalAccountTransaction extends AccountTransaction {

	@Column(name="physicalaccounttransaction_bankname")
	private String bankName;
	
	@Column(name="physicalaccounttransaction_teller")
	private String teller;

	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * @param bankName
	 *            the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	/**
	 * @return the teller
	 */
	public String getTeller() {
		return teller;
	}

	/**
	 * @param teller
	 *            the teller to set
	 */
	public void setTeller(String teller) {
		this.teller = teller;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer(512);
		sb.append("\n----PHYSICAL ACCOUNT TRANSACTION----\n");
		sb.append((bankName == null) ? "null" : bankName);
		sb.append((teller == null) ? "null" : teller);
		sb.append("----PHYSICAL ACCOUNT TRANSACTION----\n");
		return sb.toString();
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((bankName == null) ? 0 : bankName.hashCode());
		result = prime * result + ((teller == null) ? 0 : teller.hashCode());
		return result;
	}

	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhysicalAccountTransaction other = (PhysicalAccountTransaction) obj;
		if (bankName == null) {
			if (other.bankName != null)
				return false;
		} else if (!bankName.equals(other.bankName))
			return false;
		if (teller == null) {
			if (other.teller != null)
				return false;
		} else if (!teller.equals(other.teller))
			return false;
		return true;
	}

}
