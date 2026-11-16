package lessons.lesson19.homework

class StringValidator : Validator<String?> {
    override fun validate(incomingValue: String?): Boolean {
        return (!incomingValue.isNullOrEmpty() && incomingValue.isNotBlank())
    }
}