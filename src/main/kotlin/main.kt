fun main() {
    val bankFee: Double = 0.075
    val minBankFee: Int = 35
    val amountTransaction: Int = 1000

    var amount =
        if (amountTransaction * bankFee > minBankFee) {
            amountTransaction - (amountTransaction * bankFee)
        } else {
            if (amountTransaction - 35 > 0) {
                amountTransaction - 35
            } else 0
        }

    val totalMessage: String = "Вы перевели $amount руб."
    println(totalMessage)
}