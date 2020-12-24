package gaur.himanshu.august.sharedviewmodel.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import gaur.himanshu.august.sharedviewmodel.R
import gaur.himanshu.august.sharedviewmodel.SharedViewModel
import kotlinx.android.synthetic.main.fragment_third.view.*

@AndroidEntryPoint
class ThirdFragment : Fragment() {

    private val viewModel : SharedViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.third_age.text=viewModel.age
        view.third_name.text=viewModel.name
        view.third_sem.text=viewModel.semester
        view.third_stream.text=viewModel.session
        view.third_year.text=viewModel.year
    }


}