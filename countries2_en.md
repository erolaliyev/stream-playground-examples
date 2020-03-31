Assignments
===========

Write a stream pipeline that:

1. Returns whether there is at least one country with the word _island_ in its name ignoring case.

1. Returns the first country name that contains the word _island_ ignoring case.

1. Prints each country name in which the first and the last letters are the same ignoring case.

1. Prints the populations of the first ten least populous countries (required intermediate operation: [`sorted`](https:docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html#sorted()), [`limit`](https:docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html#limit(long)))).

1. Prints the names of the first ten least populous countries (required intermediate operation: [`sorted`](https:docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html#sorted(java.util.Comparator)), [`limit`](https:docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html#limit(long)))).

1. Returns summary statistics about the number of country name translations associated with each country (required intermediate operation: [`mapToInt`](https:docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html#mapToInt(java.util.function.ToIntFunction)), [`summaryStatistics`](https:docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/IntStream.html#summaryStatistics())).

1. Prints the names of countries in the ascending order of the number of timezones.

1. Prints the number of timezones for each country in the form _name_`: `_population_, in the ascending order of the number of timezones.

1. Returns the number of countries with no Spanish country name translation (the Spanish language is identified by the language code `es`).

1. Prints the names of countries with `null` area.

1. Prints all distinct language tags of country name translations sorted in alphabetical order (required intermediate operation: [`flatMap`](https:docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html#flatMap(java.util.function.Function))).

1. Returns the average length of country names.

1. Prints all distinct regions of the countries with `null` area.

1. Returns the largest country with non-`null` area.

1. Prints the names of countries with a non-`null` area below 10 (requires the use of [`BigDecimal.TEN`](https://docs.oracle.com/javase/7/docs/api/java/math/BigDecimal.html#TEN)).

1. Prints all distinct timezones of European and Asian countries.

