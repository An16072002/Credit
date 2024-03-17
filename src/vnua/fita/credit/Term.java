package vnua.fita.credit;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Term {
	private List<Term> termList;
	 private Map<Integer, Subject> subjectList=new HashMap<>();


	public List<Term> getTermList() {
		return termList;
	}

	public void setTermList(List<Term> termList) {
		this.termList = termList;
	}
}
