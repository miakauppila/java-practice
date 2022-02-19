## Ordering Playing Cards

- An example in which playing cards (Class `Kortti`) and player hands (Class `Kasi`) are ordered and compared.
- Card implements `Comparable` and `compareTo` compares the numeral values of two cards. If values are equal, compares suits in the following order: club, diamond, heart, spade.
- Class made for second type of comparison between cards implements `Comparator`. Method `compare` compares the suits of two cards. If suits are equal, compares the numeral values. 
- Hand implements `Comparable` and `compareTo` compares total summed up values of cards in two hands.
- There are two different comparison methods of cards, so a player hand can be ordered by numeral values not separating the suits, or by numeral values within each suit. 
