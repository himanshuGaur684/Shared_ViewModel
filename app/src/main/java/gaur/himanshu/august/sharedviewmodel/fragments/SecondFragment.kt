package gaur.himanshu.august.sharedviewmodel.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import gaur.himanshu.august.sharedviewmodel.R
import gaur.himanshu.august.sharedviewmodel.SharedViewModel
import kotlinx.android.synthetic.main.fragment_second.view.*

@AndroidEntryPoint
class SecondFragment : Fragment() {

    private val viewModel: SharedViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        view.sec_age.text = viewModel.age
        view.sec_name.text = viewModel.name
        view.sec_semester.text = viewModel.semester
        view.sec_year.text = viewModel.year

        view.submit.setOnClickListener {
            viewModel.session=view.sec_stream.text.toString()
            findNavController().navigate(R.id.action_secondFragment_to_thirdFragment)
        }
    }
}