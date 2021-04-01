# Hyperskill-ReadabilityScore
Developing a program that can identify the difficulty of a piece of text and identify the suitable reading age.  
https://hyperskill.org/projects/39

<img src="https://github.com/elango34/Readablity-Score-Hyperskill/blob/master/ReadabilityScore.gif" width="800" height="500" />

A readability index is an estimation of how difficult a text is to read. 
The estimation is made by measuring a text's complexity using readability index formulas. There are many formulas out there to measure readability score
and this score is compared with score-age table and we can easily tell what grade level that text can be understood.

**The formulas that I used to measure readability index are :**
	
	* AUTOMATED REDABILITY INDEX (ARI)
	* FLESCH-KINCAID GRADE LEVEL (FK)
	* SIMPLE MEASURE OF GOBBLEDYGOOK (SMOG)
	* COLEMAN LIAU (CL)

Those formula attributes are number of word, sentence, characters, syllable counts, pollysyllable count.

The score is compared with below table to get age and grade level.



|Score	| Age | Grade level
| --- | --------- | ------- |
|1	| 5-6 | Kindergarten 
|2 | 6-7 |  First/Second Grade
|3	| 7-9 |Third Grade
|4	|9-10	|Fourth Grade
|5	|10-11	|Fifth Grade
|6	|11-12	|Sixth Grade
|7	|12-13	|Seventh Grade
|8	|13-14	|Eighth Grade
|9	|14-15	|Ninth Grade
|10	|15-16	|Tenth Grade
|11	|16-17	|Eleventh Grade
|12	|17-18	|Twelfth grade
|13	|18-24	|College student
|14	|24+	 |   Professor

For more information about these formulas visit :

* Automated Readability index
https://en.wikipedia.org/wiki/Automated_readability_index
* Flesch–Kincaid readability tests
https://en.wikipedia.org/wiki/Flesch%E2%80%93Kincaid_readability_tests
* Simple Measure of Gobbledygook
https://en.wikipedia.org/wiki/SMOG
* Coleman–Liau index:
https://en.wikipedia.org/wiki/Coleman%E2%80%93Liau_index



