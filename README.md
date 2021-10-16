# Longest-Palindromic-Substring-LEETCODE-MEDIUM
O(N^2) Approach to calculate longest palindromic substring by expanding from a given index.
All my approach does is take an index, and expand outward returning the largest palindromic string at the given index. then we save the longest String and return it.

Instructions:
Given a string s, return the longest palindromic substring in s.

 

Example 1:

Input: s = "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
Example 3:

Input: s = "a"
Output: "a"
Example 4:

Input: s = "ac"
Output: "a"
 

Constraints:

1 <= s.length <= 1000
s consist of only digits and English letters.

Link to question: https://leetcode.com/problems/longest-palindromic-substring/
