package lessons.lesson15.homework

abstract class EducationalEstablishments(
    val name: String,
    val number: Int,
    val location: String
) {
}

open class School(
    val studentNumber: Int,
    schoolName: String,
    schoolNumber: Int,
    schoolLocation: String
) : EducationalEstablishments(schoolName, schoolNumber, schoolLocation)

open class KinderGarden(
    val dayGroupNumber: Int,
    kinderGardenName: String,
    kinderGardenNumber: Int,
    kinderGardenLocation: String
) : EducationalEstablishments(kinderGardenName, kinderGardenNumber, kinderGardenLocation)

class PrimarySchool(
    val listOfSubjects: MutableList<String>,
    studentNumber: Int,
    primarySchoolName: String,
    primarySchoolNumber: Int,
    primarySchoolLocation: String,
) : School (studentNumber, primarySchoolName, primarySchoolNumber, primarySchoolLocation)