package gaur.himanshu.august.sharedviewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel

class SharedViewModel @ViewModelInject constructor(

): ViewModel() {

    lateinit var name:String
    lateinit var age:String
    lateinit var semester:String
    lateinit var year:String
    lateinit var session:String
}