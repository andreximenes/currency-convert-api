package br.com.alx.messages;

import java.math.BigDecimal;
import java.util.Date;

public class Conversion extends MainMessage{
	
	private static final long serialVersionUID = -1030976682802986920L;
	
	private BigDecimal total;
	private Date lastUpdateTime;
	
	public Conversion(String from, String to, Date lastUpdateTime) {
		super(from, to);
		this.lastUpdateTime = lastUpdateTime;
	}

	public Conversion() {
		super();
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	
	
}
