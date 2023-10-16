# include <iostream>
#include <math.h>
using namespace std;

int main() 
{
	// Phuong trinh bac 2
	float a, b ,c, delta, x1, x2;
	std::cout << "Nhap he so a (a =! 0): ";
	cin >> a;
	std::cout << "Nhap he so b: ";
	cin >> b;
	std::cout << "Nhap he so c: ";
	cin >> c;
	delta = b*b - 4*a*c;
	if(delta > 0){
		std::cout <<"Phuong trinh co hai nghiem phan biet: " << std::endl;
		x1 = (-b+sqrt(delta))/(2*a);
		x2 = (-b-sqrt(delta))/(2*a);
		std::cout << "x1 = " << x1 << std::endl;
		std::cout << "x2 = " << x2 << std::endl;
	} else if (delta == 0){
		std::cout <<"Phuong trinh co nghiem kep: " << std::endl;
		std::cout << "x1 = x2 = "<< -b/2*a;
	} else{
		std::cout << "Phuong trinh vo nghiem" << std::endl;
	}
   return 0;
}
