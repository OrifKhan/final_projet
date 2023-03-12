package islom.din.dodo_ilmhona_proskills.view.ViewPager

import android.util.Log
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.dbfordodo.db.dao.dbMain.DodoDataBase
import com.example.dbfordodo.fragments.HomeFragment
import com.example.dbfordodo.fragments.ShowFragment
import islom.din.dodo_ilmhona_proskills.db.data.Pizza
import kotlin.coroutines.coroutineContext

class ViewPagerAdapter(fa: FragmentViewPager,lists: List<Pizza>) : FragmentStateAdapter(fa) {
    private val list: List<Fragment>

    init {
        list = mutableListOf()

       /* DodoDataBase.getInstance(fa.requireContext()).pizzaDao().getAllPizza()
            .observe(fa.viewLifecycleOwner) {
        */        for (i in lists) {
                    list.add(ShowFragment.newInstance(i))



            }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun createFragment(position: Int): Fragment {
        return list[position]
    }
}