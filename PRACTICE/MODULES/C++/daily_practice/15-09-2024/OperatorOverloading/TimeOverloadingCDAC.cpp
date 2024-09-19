/*
Create a C++ class Time to represent time objects with hours, minutes, and seconds. Implement the + and - operators to perform addition and subtraction of time objects, respectively. The operators should handle carry-over or borrow of time units as needed. The output should be in the format HH:MM:SS.
The Time class has three private member variables: hours, minutes, and seconds. The constructor initializes the member variables with default values of 0.
Calculates the total seconds from both time objects.
Converts the total seconds to hours, minutes, and seconds.
Returns a new Time object with the calculated values.
Calculates the difference in seconds between the two time objects.
Handles negative time differences by converting them to a positive representation.
Converts the absolute difference to hours, minutes, and seconds.
Returns a new Time object with the calculated values.
Prints the time object in the format HH:MM:SS
*/

#include <iostream>
#include <iomanip>
#include <stdexcept>
using namespace std;
class Time {
	private:
		int hours;
		int minutes;
		int seconds;

		void normalize() {
		if (seconds >= 60) {
		    minutes += seconds / 60;
		    seconds %= 60;
		} else if (seconds < 0) {
		    minutes -= (-seconds + 59) / 60;
		    seconds = (seconds % 60 + 60) % 60;
		}

		if (minutes >= 60) {
		    hours += minutes / 60;
		    minutes %= 60;
		} else if (minutes < 0) {
		    hours -= (-minutes + 59) / 60;
		    minutes = (minutes % 60 + 60) % 60;
		}

		hours = (hours + 24) % 24; // wrap around after 24 hours
		}

	public:
		// Default constructor
		Time() : hours(0), minutes(0), seconds(0) {}

		// Constructor with parameters
		Time(int h, int m, int s) : hours(h), minutes(m), seconds(s) {
			normalize();
		}

		// Operator + for addition of two Time objects
		Time operator+(const Time& other) const {
			return Time(hours + other.hours, minutes + other.minutes, seconds + other.seconds);
		}

		// Operator - for subtraction of two Time objects
		Time operator-(const Time& other) const {
			return Time(hours - other.hours, minutes - other.minutes, seconds - other.seconds);
		}

		// Print function to display time in HH:MM:SS format
		void print() const {
			cout << std::setfill('0') << std::setw(2) << hours << ":"
				<< std::setfill('0') << std::setw(2) << minutes << ":"
				<< std::setfill('0') << std::setw(2) << seconds << std::endl;
		}

		// Convert to total seconds
		int toTotalSeconds() const {
			return hours * 3600 + minutes * 60 + seconds;
		}

		// Calculate the absolute difference in time
		static Time absoluteDifference(const Time& t1, const Time& t2) {
			int diffInSeconds = std::abs(t1.toTotalSeconds() - t2.toTotalSeconds());
			return Time(diffInSeconds / 3600, (diffInSeconds % 3600) / 60, diffInSeconds % 60);
		}
};

int main() {
	Time t1(10, 30, 45);
	Time t2(2, 15, 30);

	Time sum = t1 + t2;
	Time diff = t1 - t2;

	cout << "Time 1: ";
	t1.print();
	cout << "Time 2: ";
	t2.print();

	std::cout << "Sum: ";
	sum.print();

	std::cout << "Difference: ";
	diff.print();

	Time absDiff = Time::absoluteDifference(t1, t2);
	std::cout << "Absolute Difference: ";
	absDiff.print();

	return 0;
}

