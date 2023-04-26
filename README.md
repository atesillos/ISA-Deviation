# ISA-Deviation
COMP 370 Project
Collaborators: Trevor Hafner, Faisel Ali, Angel Tesillos

## About
In flight simulation, one of the things pilots have to do is calculate the deviation from the international standard temperature at a particular altitude. In order to figure out the proper calculation, we used this site, cited [here](https://studyflying.com/isa-temperature-deviation/ "Formulae Page"), to get the two formulas:
- Formula of the ISA temperature at certain altitude: 
    - 15 – [(height/1000) x 2] °C
- Formula of the ISA temperature deviation at certain altitude:
    - Actual temperature – ISA temperature

---
## Directions
1. Pick your favorite programming language and build tool.
    - Java, Gradle
2. At least ONE unit test.
3. Set up a public GitHub repository for this activity.
4. Add unit tests and coverage report generation to the build configuration. The latter might require a language-specific plugin for your build tool, e.g., JaCoCo for Gradle or sbt-scoverage for sbt.
5. Set up a GitHub action for automatically running the tests and generating the coverage report upon commits to the repo. 
6. Add at least two status badges for in-process metrics and two more for complexity metrics; most of these would be based on hosted services.
    - How to add status badges: https://docs.github.com/en/actions/monitoring-and-troubleshooting-workflows/adding-a-workflow-status-badge
7. Make several commits that trigger automated builds. Ideally, start with the unit test(s) failing and then fix them so we can see the build status changing from fail to pass.
    - (List of commits)
8. This example https://github.com/LoyolaChicagoCode/primenumbers-http4s-scala is much more complex than required but illustrates the other requirements of this activity.
9. Extra credit for additional actions and metrics/badges.

---
## Steps
- [x] Make a barebones file.
- [x] Add gradle.
- [ ] Figure out how to use gradle.