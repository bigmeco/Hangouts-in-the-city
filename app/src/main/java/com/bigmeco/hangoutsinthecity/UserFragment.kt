package com.bigmeco.hangoutsinthecity


import android.net.Uri
import android.os.Bundle
import android.app.Fragment
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.fragment_user.*


class UserFragment : Fragment() {

    private var mAuth: FirebaseAuth? = null
    private var mGoogleSignInClient: GoogleSignInClient? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_user, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        logout.setOnClickListener{
Log.d("gggg","fg")
            val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                    .requestIdToken(getString(R.string.default_web_client_id))
                    .requestEmail()
                    .build()
            mGoogleSignInClient = GoogleSignIn.getClient(activity, gso)

            // [START initialize_auth]
            mAuth = FirebaseAuth.getInstance()
            signOut()
        }
    }



    private fun signOut() {
        // Firebase sign out
        mAuth!!.signOut()

        // Google sign out
        mGoogleSignInClient!!.signOut().addOnCompleteListener(activity
        ) {
            startActivity(Intent(activity, LoginActivity::class.java))
        }
    }
}
