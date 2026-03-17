#include <iostream>
#include <vector>
using namespace std;

class Greeter {
private:
    vector<string> names;

public:
    
    Greeter(int argc, char* argv[]) {
        for (int i = 1; i < argc; i++) {
            names.push_back(argv[i]);
        }
    }

   
    void displayGreeting() {
        if (names.empty()) {
            cout << "Hello, World!" << endl;
        } 
        else {
            cout << "Hello, ";

            for (int i = 0; i < names.size(); i++) {
                cout << names[i];

                if (i < names.size() - 1) {
                    cout << ", ";
                }
            }

            cout << "!" << endl;
        }
    }
};

int main(int argc, char* argv[]) {
    Greeter g(argc, argv);
    g.displayGreeting();
    return 0;
}