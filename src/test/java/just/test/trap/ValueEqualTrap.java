package just.test.trap;

import org.junit.Test;

public class ValueEqualTrap {
	
	/**
	 * 对象之间不能用==比较值
	 * 
	 * @MethodName: testInteger 
	 * @Description: 
	 * @throws
	 */
	@Test
	public void testInteger(){
		Ast a=new Ast(133);
		Ast b=new Ast(133);
		
		Ast c=new Ast();
		Ast d=new Ast();
		
		System.out.println(a.getWasId()==b.getWasId());
		System.out.println(c.getWasId()==d.getWasId());
		
		System.out.println(a.getWasId().equals(b.getWasId()));
		
	}

}
class Ast {
	
	private Integer wasId;

	public Integer getWasId() {
		return wasId;
	}

	public void setWasId(Integer wasId) {
		this.wasId = wasId;
	}
	
	public Ast() {
		super();
	}

	public Ast(Integer wasId) {
		super();
		this.wasId = wasId;
	}
	
	
	

}
