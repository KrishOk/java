#include <iostream>
using namespace std;

class Greeter {
private:
    string name;

public:
   
    Greeter(int argc, char* argv[]) {
        if (argc > 1) {
            name = argv[1];   
        } else {
            name = "World";   
        }
    }

    void displayGreeting() {
        cout << "Hello, " << name << "!" << endl;
    }
};

int main(int argc, char* argv[]) {
    Greeter g(argc, argv);
    g.displayGreeting();
    return 0;
}