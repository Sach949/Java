public class T20CricketDto {

	private int matchNumber;
	private String seriesName;
	private String sponsorName;
	private String playedBtw;
	private int totalOversInAnInnings;
	private int noOfOversBowlerCanBowl;
	private int oversInPowerPlay;
	
	public T20CricketDto() {
		
	}

	public T20CricketDto(int matchNumber, String seriesName, String sponsorName, String playedBtw,
			int totalOversInAnInnings, int noOfOversBowlerCanBowl, int oversInPowerPlay) {
		super();
		this.matchNumber = matchNumber;
		this.seriesName = seriesName;
		this.sponsorName = sponsorName;
		this.playedBtw = playedBtw;
		this.totalOversInAnInnings = totalOversInAnInnings;
		this.noOfOversBowlerCanBowl = noOfOversBowlerCanBowl;
		this.oversInPowerPlay = oversInPowerPlay;
	}

	public int getMatchNumber() {
		return matchNumber;
	}

	public void setMatchNumber(int matchNumber) {
		this.matchNumber = matchNumber;
	}

	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public String getSponsorName() {
		return sponsorName;
	}

	public void setSponsorName(String sponsorName) {
		this.sponsorName = sponsorName;
	}

	public String getPlayedBtw() {
		return playedBtw;
	}

	public void setPlayedBtw(String playedBtw) {
		this.playedBtw = playedBtw;
	}

	public int getTotalOversInAnInnings() {
		return totalOversInAnInnings;
	}

	public void setTotalOversInAnInnings(int totalOversInAnInnings) {
		this.totalOversInAnInnings = totalOversInAnInnings;
	}

	public int getNoOfOversBowlerCanBowl() {
		return noOfOversBowlerCanBowl;
	}

	public void setNoOfOversBowlerCanBowl(int noOfOversBowlerCanBowl) {
		this.noOfOversBowlerCanBowl = noOfOversBowlerCanBowl;
	}

	public int getOversInPowerPlay() {
		return oversInPowerPlay;
	}

	public void setOversInPowerPlay(int oversInPowerPlay) {
		this.oversInPowerPlay = oversInPowerPlay;
	}

	@Override
	public String toString() {
		return "T20Cricket [matchNumber=" + matchNumber + ", seriesName=" + seriesName + ", sponsorName=" + sponsorName
				+ ", playedBtw=" + playedBtw + ", totalOversInAnInnings=" + totalOversInAnInnings
				+ ", noOfOversBowlerCanBowl=" + noOfOversBowlerCanBowl + ", oversInPowerPlay=" + oversInPowerPlay + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + matchNumber;
		result = prime * result + noOfOversBowlerCanBowl;
		result = prime * result + oversInPowerPlay;
		result = prime * result + ((playedBtw == null) ? 0 : playedBtw.hashCode());
		result = prime * result + ((seriesName == null) ? 0 : seriesName.hashCode());
		result = prime * result + ((sponsorName == null) ? 0 : sponsorName.hashCode());
		result = prime * result + totalOversInAnInnings;
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
		T20CricketDto other = (T20CricketDto) obj;
		if (matchNumber != other.matchNumber)
			return false;
		if (noOfOversBowlerCanBowl != other.noOfOversBowlerCanBowl)
			return false;
		if (oversInPowerPlay != other.oversInPowerPlay)
			return false;
		if (playedBtw == null) {
			if (other.playedBtw != null)
				return false;
		} else if (!playedBtw.equals(other.playedBtw))
			return false;
		if (seriesName == null) {
			if (other.seriesName != null)
				return false;
		} else if (!seriesName.equals(other.seriesName))
			return false;
		if (sponsorName == null) {
			if (other.sponsorName != null)
				return false;
		} else if (!sponsorName.equals(other.sponsorName))
			return false;
		if (totalOversInAnInnings != other.totalOversInAnInnings)
			return false;
		return true;
	}
	
	
}
