package com.peaches

class Planting {

		String plant
		String productUrl
		String form
		String plantingDate
		String notes
		String observations

    static constraints = {
			plant(blank: false)
			plantingDate(blank: false)
    }
}
