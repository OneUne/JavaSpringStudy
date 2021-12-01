package ch11;

public class MakeReport {
	
	// String을 계속 더하는 것은 메모리 오버헤드. so 늘어날 수 있는 buffer에 연결해 나중에 String으로 리턴함.
	StringBuffer buffer = new StringBuffer(); 
	
	private String line = "=======================================\n";
	private String title = "  이름\t   주소\t\t  전화번호  \n";
	private void makeHeader() {
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);
	}
	private void generateBody() {
		buffer.append("James  \t");
		buffer.append("Seoul Korea  \t");
		buffer.append("010-2222-3333\n");
		buffer.append("Tomas  \t");
		buffer.append("NewYork US  \t");
		buffer.append("010-7777-0987\n");
		
	}
	private void makeFooter() {
		buffer.append(line);
	}
	
	public String getReport() {
		makeHeader();
		generateBody();
		makeFooter();
		return buffer.toString();
	}
	
}
