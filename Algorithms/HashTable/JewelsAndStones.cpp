//
// Created by archit.s on 13/08/18.
//
// Time:  O(m + n)
// Space: O(n)

#include <cstdlib>
#include <string>
#include <iostream>
#include <unordered_set>

using namespace std;

class JewelsAndStones {
public:
    int numJewelsInStones(string J, string S) {
        unordered_set<char> lookup;
        for (const auto& j : J) {
            lookup.insert(j);
        }
        int result = 0;
        for (const auto& s : S) {
            result += lookup.count(s);
        }
        return result;
    }
};

int main(){

    JewelsAndStones jewelsAndStones;
    cout << jewelsAndStones.numJewelsInStones("aa", "AAaaBB");

    return 0;
}
