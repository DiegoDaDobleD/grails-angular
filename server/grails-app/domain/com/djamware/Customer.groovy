package com.djamware

import grails.rest.*

@Resource(uri='/api/customer', formats=['json', 'xml']) // readOnly = true , formats=['json', 'xml']
class Customer {

  String name
  String address
  String city
  String postalCode
  String phone

  static constraints = {
      name blank:false
      address blank:false
      city blank:false
      postalCode blank:false
      phone blank:false
  }

  String toString() {
    name
  }
}
