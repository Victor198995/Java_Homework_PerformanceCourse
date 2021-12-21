Write functional programming lambda expressions using Java 8 streams. Each task must be solved with one lambda expressions. Put lambda expressions in the return statement1.

At the Low level, you need to solve the following five tasks:

Task 1.

The character C and a sequence of non-empty strings stringList are given. Get a new sequence of strings with more than one character from the stringList, starting and ending with C. For example:
input: Symbol = 'a', {"Hello", "qwerty", "asda", "asdfa", "as", "a"}
output: {"asda", "asdfa"}

Task 2.

A sequence of non-empty strings stringList is given. Get a sequence of ascending sorted integer values equal to the lengths of the strings included in the stringList sequence. For example:
input: {"Hello", "world", "!", "Good", "morning", "!"}
output: {1, 1, 4, 5, 5, 7}

Task 3.

A sequence of non-empty strings stringList is given. Get a new sequence of strings, where each string consists of the first and last characters of the corresponding string in the stringList sequence. For example:
input: {"asd", "a", "basdw"}
output: {"ad", "aa", "bw"}

Task 4.

A positive integer K and a sequence of non-empty strings stringList are given. Strings of the sequence contain only numbers and capital letters of the Latin alphabet. Get from stringList all strings of length K ending in a digit and sort them in ascending order. For example:
input: number = 2, {"8DC3", "4F", "B", "3S", "S3", "A1", "2A3G", "1B"}
output: {"A1", "S3"}

Task 5.

A sequence of positive integer values integerList is given. Get sequence of string representations of only odd integerList values and sort in ascending order. For example:
input: {1, 2, 3, 4, 5, 6}
output: {"1", "3", "5"}

At the MIDDLE level, you need to solve the following five tasks:

Task 6.

A sequence of positive integers numbers and a sequence of strings stringList are given. Get a new sequence of strings according to the following rule: for each value n from sequence numbers, select a string from sequence stringList that starts with a digit and has length n. If Look at the template on the end of the task before solving the problem. there are several required strings in the stringList sequence, return the first; if there are none, then return the string "Not found" For example:
input: {1, 3, 4}, {"1aa", "aaa", "1", "a"}
output: {"1", "1aa", "Not Found"}

Task 7.

You are given a positive integer K and a sequence of integers integerList. Calculate the symmetrical difference between two subsets of integer values: the first subset is all even integerList values, the second subset is the integerList values excluding the first K elements. In the resulting difference, replace the order with the reversed. //Example: Input 123456789, result 9,7,4,2 For example:
input: number = 5, {1, 2, 3, 4, 5, 6, 7, 8, 9}
output: {9, 7, 4, 2}

Task 8.

You are given a positive integer K and integer D and a sequence of integers integerList. Compute a union of two subsets of integers: the first subset is all values of integerList greater than D, the second subset is an integer list of values starting with an element with ordinal number K inclusive (the numbering of elements in the integer list starting from 0). Sort the resulting sequence in descending order. For example:
input: D = 3, K = 4, integerList{-10, 3, -3, 4, 55, 6}
output: {55, 6, 4}

Task 9.

A sequence of non-empty strings stringList is given, containing only uppercase letters of the Latin alphabet. For all strings starting with the same letter, determine their total length and obtain a sequence of strings of the form "S-C", where S is the total length of all strings from stringList that begin with the character C. Order the resulting sequence in descending order of the numerical values of the sums, and for equal values of the sums, in ascending order of the C character codes. For example:
input: {"ABC", "A", "BCD", "D"}
output: {"4-A", "3-B", "1-D"}

Task 10.

A sequence of non-empty strings of Latin alphabet characters stringList is given. Select the last character from each string, converting it to uppercase. Return sorted sequence of characters in descending order by initial string length. For example:
input: {"asnsbiu", "asdsad", "asnsb", "asdf", "asdfb", "as", "a", "aop"}
output: {'U', 'D', 'B', 'B', 'F', 'P', 'S', 'A'}

At the ADVANCED level, you need to solve the following five tasks:

Task 11.

A sequence of data about applicants nameList of type Entrant is given. Each element of the sequence includes the fields <school_number> <year_of_entering> <last_name> Get data (list of YearSchoolStat values) about the number of different schools that applicants graduated from for each year present in the source data. The YearSchoolStat type includes the <year_of_entering> <number_of_schools> fields. The list of YearSchoolStat values must be sorted in ascending order of the number of schools, and for matching values, in ascending order of the year number.

Look at the template on the end of the task before solving the problem. For example:
input: { (1, 1993, "Ivanov"), (2, 1992, "Petrov"), (3, 1993, "Pupkin"), (3, 2000, "Zobkin"), (3, 2000, "Zabkin") }
output: { YearSchoolStat{yearOfEntering=1992, numberOfSchools=1}, YearSchoolStat{yearOfEntering=2000, numberOfSchools=1}, YearSchoolStat{yearOfEntering=1993, numberOfSchools=2} }

Task 12.

A sequence of positive integers integerList1 and integerList2 are given. All values in each sequence are different. Get a set (list of NumberPair values) of all value pairs that satisfy the following conditions: the first element of the pair belongs to the sequence integerList1, the second belongs to integerList2, and both elements end with the same digit. The NumberPair type includes <value_1> <value_2> fields. The resulting NumberPair list must be sorted in ascending order by the first field, and if they are equal, by the second. For example:
input: {1, 2, 33, 44}, {11, 22, 13}
output: {NumberPair(1, 11), NumberPair(2, 22), NumberPair(33, 13)}

Task 13.

A sequence of data about applicants nameList of type Entrant and a sequence of integers yearList representing years are given. Each element of the nameList sequence includes the fields <school_number> <year_of_entering> <last_name>. Get data (a list of YearSchoolStat values) about the number of different schools that applicants graduated from, for each year from the yearList. YearSchoolStat includes < year_of_entering> <number_of_schools> fields. If in the given year of admission there are no applicants from the listed schools, indicate zero in the field < number_of_schools >. The YearSchoolStat list must be sorted in ascending order by the number of schools, and for matching values, in ascending order by the year number. For example:
input: { 2001, 1999, 2000, 2002, 2003 }

{ (11, 2003, "Ivanov"), (11, 2001, "Petrov"), (11, 2001, "Pupkin"), (10, 1999, "Zobkin"), (10, 1999, "Zabkin"), (10, 1999, "Ivanov"), (10, 2000, "Petrov"), (14, 2001, "Pupkin"), (15, 2000, "Zobkin"), (10, 2000, "Ivanov"), (12, 2003, "Petrov"), (11, 2003, "Pupkin"), (10, 2003, "Zobkin"), }
output: { (2002, 0), (1999, 1), (2000, 2) (2001, 2) (2003, 3) }

Task 14.

A sequence of customer information for a supplierList of type Supplier and a sequence of discounts for customers in various stores, supplierDiscountList of type SupplierDiscount is given. Each element of the supplierList sequence includes the fields <customer_ID>, <year_of_birth>, <street_of_residence>. Each element of the supplierDiscountList sequence includes the fields <customer_ID>, <store_name>, <discount_percentage>. Get a list (maxDiscountOwner values) of all stores and for each store find a customer who has the maximum discount in it. If for a certain store there are several customers with the maximum discount, then take the data on the consumer with the minimum code. Sort the list by store names in ascending alphabetical order. For example:
input: { Supplier(1, 1993, "Sumskaya") Supplier(2, 1994, "Pushkinskaya") Supplier(3, 1995, "Beketova") Supplier(4, 1996, "Amosova") Supplier(5, 1996, "Amosova")

SupplierDiscount(1, 9, "Posad") SupplierDiscount(2, 9, "Posad") SupplierDiscount(3, 10, "Colins") SupplierDiscount(4, 10, "Colins") SupplierDiscount(5, 10, "Denim") }
output: { ("Colins", new Supplier(3, 1995, "Beketova")) ("Denim", new Supplier(5, 1996, "Amosova")) ("Posad", new Supplier(1, 1993, "Sumskaya")) }

Task 15.

A sequence of information about goods goodList of type Good and a sequence of prices of goods in various stores storePriceList of type StorePrice are given. Each element of the goodList sequence includes the <product_SKU>, <product_name>, <country_of_origin> fields. Each element of the storePriceList sequence includes the <product_SKU>, <store_Title>, bigDecimal<price> fields. For each country of origin get the number of stores offering goods manufactured in that country, as well as the minimum price for goods from this country for all stores (CountryStat values). If no product is found for a certain country that is presented in any store, then the number of stores and the minimum price are assumed to be 0. Sort the list by country of origin.

Look at the template on the end of the task before solving the problem. For example:
input: { Good(1, "milk", "Poland"), Good(2, "milk", "Russia") }, { StorePrice(1, "BigShop", BigDecimal("12.50")), StorePrice(1, "SushiBar", BigDecimal("10.50")), StorePrice(2, "BigShop", BigDecimal("12.50")) }
output: { CountryStat("Poland", 2, BigDecimal("10.50)), CountryStat("Russia", 1, BigDecimal("12.50")) }

An example of solving a task in AutoCode.

Task. Given a sequence of strings stringList. Get a new list of non-empty strings from stringList.

public static List<String> getStringList(List<String> stringList){
return stringList.stream()
.filter(string -> !string.isEmpty())
.collect(Collectors.toList());
}
Consider that the values have already been set for stringList, and the assignment of new values is an error. Return the result of solving the problem via the function.

Look at the template on the end of the task before solving the problem. 1