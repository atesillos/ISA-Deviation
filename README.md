![example workflow](https://github.com/atesillos/ISA-Deviation/actions/workflows/main.yml/badge.svg)
![push event parameter](https://github.com/atesillos/ISA-Deviation/actions/workflows/main.yml/badge.svg?event=push)

![workflow](https://github.com/atesillos/ISA-Deviation/actions/workflows/main.yml/badge.svg)
# ISA-Deviation
COMP 370 Group Activity 4

Collaborators: Trevor Hafner, Faisel Ali, Angel Tesillos

---
## About
In flight simulation, one of the things pilots have to do is calculate the deviation from the international standard temperature at a particular altitude. In order to figure out the proper calculation, we used this site, cited [here](https://studyflying.com/isa-temperature-deviation/ "Formulae Page"), to get the two formulas:
- Formula of the ISA temperature at certain altitude: 
    - 15 – [(height/1000) x 2] °C
    - Alternatively, [calculator.academy](https://calculator.academy/isa-temperature-calculator/) uses a very similar formula that is not rounded up. The site also includes additional information regarding the usage of the formula. 
- Formula of the ISA temperature deviation at certain altitude:
    - Actual temperature – ISA temperature

The example from calculator.academy (as cited above) demonstrates this very well:
1. AT = -30, Alt = 26000
2. ST = 15 - (1.98 * (26000/1000))
    - = 15 - (1.98 * 26)
    - = 15 -  51.48
    - = -36.48 degrees Celsius
3. ISAT = ST - AT
    - = -36.48 - (-30)
    - = -6.48

Both of these formulas are used in calculating vital components in air-temperature while at an altitude. We are given two variables:
- AT for 'actual temperature'. Calculated by using the aircraft's thermometer. This is in degrees Celsius. 
- Alt for 'altitude'. This is calculated by using the aircraft's elevation readings.

With these variables we can calculate:
- ST for 'standard temperature'. Calculated by dividing the current altitude by 1000, then multiplying that by (2 or 1.98), ultimately subtracting 15 from that.
- ISAT for 'ISA temperature difference'. Calculated by subtracting the AT from the ST. 

---
## Directions
1. Pick your favorite programming language and build tool.
    - Java 
    - Gradle [(doc linked)](https://docs.gradle.org/current/userguide/getting_started.html "Gradle docs")
2. At least ONE unit test.
3. Set up a public GitHub repository for this activity.
4. Add unit tests and coverage report generation to the build configuration. The latter might require a language-specific plugin for your build tool, e.g., JaCoCo for Gradle or sbt-scoverage for sbt.
    - Add JaCoCo
5. Set up a GitHub action for automatically running the tests and generating the coverage report upon commits to the repo. 
6. Add at least two status badges for in-process metrics and two more for complexity metrics; most of these would be based on hosted services.
    - [How to add status badges.](https://docs.github.com/en/actions/monitoring-and-troubleshooting-workflows/adding-a-workflow-status-badge)
7. Make several commits that trigger automated builds. Ideally, start with the unit test(s) failing and then fix them so we can see the build status changing from fail to pass.
    - (List of commits)
8. [This example](https://github.com/LoyolaChicagoCode/primenumbers-http4s-scala) is much more complex than required but illustrates the other requirements of this activity.
9. Extra credit for additional actions and metrics/badges.

---
## TO-DO:
- [x] Make a barebones file.
- [x] Add gradle.
- [x] Add a badge.
- [ ] Figure out how to use gradle.
    - [ ] Learn and add JaCoCo.
- [ ] Firgure out badges.
- [ ] Add a working badge.
- [ ] Make unit tests.

---
## Gradle Notes