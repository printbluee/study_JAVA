package singleton;

class CompanyInfo {
	
	private static CompanyInfo innstance = new CompanyInfo(); 
    private String companyName;
    private String companyAddr;
    
    
    private CompanyInfo() {} // 인스턴스 생성 제어를 private 로 했음, 클래스 외부에서 인스턴스 생성을 막음
    
    public static CompanyInfo getInstance() { // 반환형 CompanyInfo
        return innstance;
    }
    
    // setter/getter
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    public String getCompanyName() {
        return companyName;
    }
 
    public void setCompanyAddr(String companyAddr) {
        this.companyAddr = companyAddr;
    } 
 
    public String getCompanyAddr() {
        return companyAddr;
    }
}

public class HjEx01 {

	public static void main(String[] args) {

		CompanyInfo companyInfo = CompanyInfo.getInstance();
		companyInfo.setCompanyName("하이미디어");
		companyInfo.setCompanyAddr("신촌");
		
		System.out.println( "companyName : " + companyInfo.getCompanyName() );
        System.out.println( "companyAddr : " + companyInfo.getCompanyAddr() );
        
        CompanyInfo companyInfo2 = CompanyInfo.getInstance();
        companyInfo2.setCompanyName("영퍼니");
        companyInfo2.setCompanyAddr("김포");
		
		System.out.println( "companyName : " + companyInfo2.getCompanyName() );
        System.out.println( "companyAddr : " + companyInfo2.getCompanyAddr() );
	}
}
