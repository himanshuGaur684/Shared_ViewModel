package gaur.himanshu.august.sharedviewmodel.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import gaur.himanshu.august.sharedviewmodel.R
import gaur.himanshu.august.sharedviewmodel.SharedViewModel
import kotlinx.android.synthetic.main.fragment_first.view.*

@AndroidEntryPoint
class FirstFragment : Fragment() {


    private val viewModel: SharedViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        view.step_2.setOnClickListener {
            viewModel.age = view.age.text.toString()
            viewModel.name = view.name.text.toString()
            viewModel.year = view.year.text.toString()
            viewModel.semester = view.semester.text.toString()

            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }
    }


}