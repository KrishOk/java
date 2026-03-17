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

            )
            bool first = true;
            for (const string& name : names) {
                if (!first) {
                    cout << ", ";
                }
                cout << name;
                first = false;
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