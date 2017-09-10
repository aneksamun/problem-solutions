package coins

import coins.Currency.GBX

class FivePence : Coin(5, GBX) {

    override fun toString(): String {
        return "$denomination${currency.sign}"
    }
}
