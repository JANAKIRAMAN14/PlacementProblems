package Assignment20

import org.apache.groovy.util.Arrays;
// Vowels Words:
def name = "Groovy Programming";
name.trim();
def count = 0;
for(int i = 0 ; i < name.length() ; i++){
    if(name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i'||
            name.charAt(i) == 'o' || name.charAt(i) == 'u')
            count = count + 1;
}
println("Vowels count of given String :"+count);

// reverse the words :

def s = "knowledge";
println ("Reverse the Given String :"+s.reverse());

// palindrome

def str  = "madam";
def i = 0;
def j = str.length() - 1;
while (i < j){
    if(str.charAt(i) != str.charAt(j))
        println("It is not palindrome :");
    i++;
    j--;
}
println "It is Palindrome :";

// anagrams :

def s1 = "listen"
def s2 = "silent"

int[] fre = new int[26]

// Early exit if lengths differ
if (s1.length() != s2.length()) {
    println("It is not an Anagram")
    return
}

// Count character frequency
for (int e = 0; e < s1.length(); e++) {
    fre[s1.charAt(e) - 'a'.charAt(0)]++
}
for (int g = 0; g < s2.length(); g++) {
    fre[s2.charAt(g) - 'a'.charAt(0)]--
}

// Check frequency array
for (int t : fre) {
    if (t != 0) {
        println("It is not an Anagram")
        return
    }
}

println("It is an Anagram")

// remove duplicates

def input =[1, 2, 2, 3, 4, 4, 5]
Set<Integer> ans = new HashSet<>();
for(int y = 0 ; y < input.size() ; y++){
    ans.add(input.get(y));
}

println (ans.toString());

// Prime Number
def isPrime(int num) {
    if (num <= 1) return false
    if (num == 2) return true
    if (num % 2 == 0) return false

    for (int i = 3; i <= Math.sqrt(num); i += 2) {
        if (num % i == 0)
            return false
    }
    return true
}

def inp = 17
println(isPrime(inp))  // Output: true

// Interest list :

def list1 = [1, 2, 3, 4]
def list2 = [3, 4, 5, 6]

def common = list1.intersect(list2)

println("Common elements: $common")

// Fibonacci series up to N terms

def n = 10
def a = 0
def b = 1

print("$a $b ")

for (int h = 2; h < n; h++) {
    def c = a + b
    print("$c ")
    a = b
    b = c
}
