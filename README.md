# INTERVIEW-QUESTIONS -> The above solution is for the question , when you have to find a number in an INFINITE array.
So the solution approach for this question goes like assume that the number you have to find comes under the range of a low and a high number i.e low <= number <= high then fo rthus \
then if the number is greater than a[high] of the array then low = high & high = 2*high (here we are increasing high exponentially)
as soon as our number becomes smaller than a[high] we then execute the BinarySearch(a,key,low,high).
