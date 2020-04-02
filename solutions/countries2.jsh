import countries.*;

var countries = new Countries().getAll();

// 1. Returns whether there is at least one country with the word island in its name ignoring case.

countries.stream().map(country -> country.getName().toLowerCase()).anyMatch(country -> country.contains("island"));

// 2. Returns the first country name that contains the word island ignoring case.

countries.stream().map(country -> country.getName().toLowerCase()).filter(country -> country.contains("island")).findFirst();

// 3. Prints each country name in which the first and the last letters are the same ignoring case.

countries.stream().map(country -> country.getName().toLowerCase()).filter(country -> country.charAt(0) == country.charAt(country.length() - 1)).forEach(System.out::println)

// 4. Prints the populations of the first ten least populous countries (required intermediate operation: sorted, limit)).

countries.stream().mapToLong(country -> country.getPopulation()).sorted().limit(10).forEach(System.out::println)

// 5. Prints the names of the first ten least populous countries (required intermediate operation: sorted, limit)).

countries.stream().
    sorted(Comparator.comparingLong(Country::getPopulation)).
    map(country -> country.getName()).
    limit(10).
    forEach(System.out::println)

//6. Returns summary statistics about the number of country name translations associated with each country (required intermediate operation: mapToInt, summaryStatistics).

countries.stream().
    mapToInt(country -> country.getTranslations().values().size()).
    summaryStatistics()

//7. Prints the names of countries in the ascending order of the number of timezones.

countries.stream().
    sorted(Comparator.comparingInt(country -> country.getTimezones().size())).
    map(country -> country.getName()).
    forEach(System.out::println)

//8. Prints the number of timezones for each country in the form name_:_population, in the ascending order of the number of timezones.

countries.stream().
    sorted(Comparator.comparingInt(country -> country.getTimezones().size())).
    forEach(country -> System.out.println(country.getName() + "_:_" + country.getPopulation()))

//9. Returns the number of countries with no Spanish country name translation (the Spanish language is identified by the language code es).

countries.stream().
    filter(country -> !country.getTranslations().containsKey("es")).
    map(Country::getName).
    count();

//10. Prints the names of countries with null area.

countries.stream().
    filter(country -> country.getArea() == null).
    map(Country::getName).
    forEach(System.out::println)

//11. Prints all distinct language tags of country name translations sorted in alphabetical order (required intermediate operation: flatMap).

countries.stream().
    flatMap(country -> country.getTranslations().keySet().stream()).
    sorted().
    distinct().
    forEach(System.out::println)

//12. Returns the average length of country names.

countries.stream().
    mapToInt(country -> country.getName().length()).
    average().
    getAsDouble()

//13. Prints all distinct regions of the countries with null area.

countries.stream().
    filter(country -> country.getArea() == null).
    map(country -> country.getRegion()).
    distinct().
    forEach(System.out::println)

//14. Returns the largest country with non-null area.

countries.stream().
    filter(country -> !(country.getArea() == null)).
    max(Comparator.comparing(Country::getArea)).
    get()

//15. Prints the names of countries with a non-null area below 10 (requires the use of BigDecimal.TEN).

countries.stream().
    filter(country -> !(country.getArea() == null) && country.getArea().
    compareTo(BigDecimal.TEN) < 0).
    map(Country::getName).
    forEach(System.out::println)


