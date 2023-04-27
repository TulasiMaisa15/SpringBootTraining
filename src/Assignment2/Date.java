package Assignment2;

public class Date {
	public int day;
	public int month;
	public int year;

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;

		if (month == 2 || month == 4 || month == 6 || month == 8 && day >= 30) {
			this.day = 30;
		} else if (day < 1) {
			this.day = 1;
		} else if (month == 3 || month == 5 || month == 7 || month == 9 && day >= 31) {
			this.day = 31;
		} else if (day < 1) {
			this.day = 1;
		}
		if (month > 12) {
			this.month = 12;
		} else if (month < 1) {
			this.month = 1;
		}
		if (year < 2023) {
			this.year = 2023;
		} else if (year > 2033) {
			this.year = 2033;

		}
		
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	public static void main(String[] args) {
		Date date = new Date(-1, 13, 2034);

		System.out.println(date);
	}

}
