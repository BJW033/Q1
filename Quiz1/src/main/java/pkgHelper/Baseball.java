package pkgHelper;

public class Baseball {
	String Name;
	int Hits;
	int ABs;
	int Doubles;
	int Triples;
	int HRs;
	int Runs;
	int BBs;
	
	public Baseball(String n,int ab,int h,int dub,int tri,int hr,int r,int bb) {
		this.Name= n;
		this.Hits = h;
		this.ABs = ab;
		this.Doubles= dub;
		this.Triples = tri;
		this.HRs = hr;
		this.Runs = r;
		this.BBs = bb;
	}
	public double battingAverage() {
		return Hits/ABs;
	}
	public double OBP() {
		return Hits/(ABs + BBs);
	}
	public double slug() {
		return 0;
	}
	public double onBasePlusSlug(){
		return OBP() + slug();
	}
	public int totalBases() {
		int singles = Hits - Doubles-Triples-HRs;
		return Doubles*2 + Triples*3 + HRs*4 + BBs + singles;
	}
}
