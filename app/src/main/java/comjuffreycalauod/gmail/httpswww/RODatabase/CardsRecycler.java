package comjuffreycalauod.gmail.httpswww.RODatabase;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import static comjuffreycalauod.gmail.httpswww.RODatabase.R.id.action_search;

/**
 * Created by Mr.Darkycible on 8/1/2017.
 */

public class CardsRecycler extends AppCompatActivity implements SearchView.OnQueryTextListener


{

    RecyclerView recyclerView;
    CardsRecyclerAdapter mCardsRecyclerAdapter;
    RecyclerView.LayoutManager recycLayoutManager;





    String [] card_names;

    //array for images
    int[] img_resArray = {R.drawable.abyssknight,R.drawable.agav,
            R.drawable.alarm,R.drawable.alice,R.drawable.alicel,R.drawable.aliot,R.drawable.alliza,R.drawable.allligator,
            R.drawable.ammut,R.drawable.ambernite,R.drawable.amonra,R.drawable.anaconda,R.drawable.ancientmimic,R.drawable.ancientmummy,R.drawable.ancientworm,R.drawable.andrecard,R.drawable.andreegg,R.drawable.andrelarva,R.drawable.angeling,R.drawable.anolian,R.drawable.anopheles,R.drawable.antonio,R.drawable.anubis,R.drawable.apocalipse,R.drawable.aquaelemental,R.drawable.archangeling,R.drawable.archdam,R.drawable.archerskeleton,R.drawable.arclouse,R.drawable.argiope,R.drawable.argos,R.drawable.armeyer,R.drawable.assassincross,R.drawable.assaulter,R.drawable.aster,R.drawable.atroce,R.drawable.babyesert,R.drawable.babyleo,R.drawable.banshee,R.drawable.bansheemaster,R.drawable.baphojr,R.drawable.baphomet,R.drawable.baroness,R.drawable.bathorycard,R.drawable.bettleking,R.drawable.beholder,R.drawable.berzebub,R.drawable.bigfoot,R.drawable.blazzer,R.drawable.bloodyybutt,R.drawable.bloodyknigt,R.drawable.bloodymurderer,R.drawable.blueacidus,R.drawable.bongun,R.drawable.bossegnigem,R.drawable.bowguardian,R.drawable.breeze,R.drawable.brilight,R.drawable.byorgue,R.drawable.carame,R.drawable.caratcard,R.drawable.catoninetail,R.drawable.caterpillarcard,R.drawable.cecildemonncard,R.drawable.centepidecard,R.drawable.centipidelarvacard,R.drawable.chepetcard,R.drawable.chimeracard,R.drawable.chococard,R.drawable.chonchon,R.drawable.christmascookie,R.drawable.clockcard,R.drawable.cloudhermitcard,R.drawable.coco,R.drawable.condor,R.drawable.cookie,R.drawable.cornus,R.drawable.cornutus,R.drawable.crabcard,R.drawable.crampcard,R.drawable.creamy,R.drawable.creamyfear,R.drawable.cruiser,R.drawable.dameofsentinnel,R.drawable.darkframe,R.drawable.darkillusion,R.drawable.darklord,R.drawable.darkpriest,R.drawable.darkshadow,R.drawable.deathword,R.drawable.demonfungus,R.drawable.desertwolf,R.drawable.despero,R.drawable.detardeuris,R.drawable.deviace,R.drawable.deviling,R.drawable.deviruchi,R.drawable.diabolic,R.drawable.dimik,R.drawable.disguise,R.drawable.dokebi,R.drawable.dolor,R.drawable.doppel,R.drawable.draco,R.drawable.dracula,R.drawable.dragonegg,R.drawable.dragonfly,R.drawable.dragontaill,R.drawable.drainiliar,R.drawable.drake,R.drawable.driller,R.drawable.drops,R.drawable.drosera,R.drawable.dryad,R.drawable.dulllahan,R.drawable.dumpling,R.drawable.dustiness,R.drawable.earthdeleter,R.drawable.earthpetite,R.drawable.echio,R.drawable.eclipse,R.drawable.eddga,R.drawable.eggrya,R.drawable.egnigem,R.drawable.eldercard,R.drawable.elderwillow,R.drawable.enchanntedpeach,R.drawable.entweihen,R.drawable.eremes,R.drawable.errende,R.drawable.evildruid,R.drawable.evilnymph,R.drawable.evilsanke,R.drawable.executioner,R.drawable.explosion,R.drawable.fabre,R.drawable.falllenbishop,R.drawable.falseangelcard,R.drawable.familiar,R.drawable.femalethhief,R.drawable.firelock,R.drawable.flameskull,R.drawable.flora,R.drawable.freezer,R.drawable.frilldora,R.drawable.frus,R.drawable.furseal,R.drawable.gajomart,R.drawable.galapago,R.drawable.galion,R.drawable.gargoyle,R.drawable.gazeti,R.drawable.gemini,R.drawable.geographer,R.drawable.ghostring,R.drawable.ghoul,R.drawable.gianthhornet,R.drawable.giantspider,R.drawable.giantwhisper,R.drawable.gibbet,R.drawable.giearth,R.drawable.gig,R.drawable.gloomunder,R.drawable.goat,R.drawable.goblinarcher,R.drawable.goblin,R.drawable.goblinleader,R.drawable.goblinsteamrider,R.drawable.goldacidus,R.drawable.goldenthief,R.drawable.golem,R.drawable.grandpecopeco,R.drawable.greatestgeneral,R.drawable.greenferus,R.drawable.greenmaiden,R.drawable.gremlin,R.drawable.grizzlly,R.drawable.grove,R.drawable.gryphon,R.drawable.gullinbursti,R.drawable.harpy,R.drawable.hatibebe,R.drawable.hatii,R.drawable.heater,R.drawable.hellpoodle,R.drawable.hermitplant,R.drawable.highorc,R.drawable.highpriest,R.drawable.highwizard,R.drawable.hillwind,R.drawable.hillslion,R.drawable.hode,R.drawable.hodremlin,R.drawable.holden,R.drawable.horn,R.drawable.hornet,R.drawable.horong,R.drawable.howard,R.drawable.hunterfly,R.drawable.hydracard,R.drawable.hydrolancer,R.drawable.hylozoist,R.drawable.icetitan,R.drawable.ifrit,R.drawable.imp,R.drawable.incubus,R.drawable.injustice,R.drawable.ironfist,R.drawable.isilla,R.drawable.isis,R.drawable.jakk,R.drawable.jingguai,R.drawable.joker,R.drawable.kafrablossom,R.drawable.kaho,R.drawable.kapha,R.drawable.karakasa,R.drawable.kasa,R.drawable.kathryne,R.drawable.kavach,R.drawable.khalitzburg,R.drawable.kiel,R.drawable.killermantis,R.drawable.knocker,R.drawable.koboldarcher,R.drawable.kobold,R.drawable.koboldleader,R.drawable.kraben,R.drawable.ktulllanux,R.drawable.kukre,R.drawable.ladysolace,R.drawable.ladytanee,R.drawable.laurell,R.drawable.lavagolem,R.drawable.leafcat,R.drawable.leib,R.drawable.loli,R.drawable.lordknight,R.drawable.lordofthedead,R.drawable.luciolavespa,R.drawable.lude,R.drawable.lunatic,R.drawable.maeroofthanatos,R.drawable.magmaring,R.drawable.magnolia,R.drawable.majouros,R.drawable.maletheifbug,R.drawable.mandragora,R.drawable.mantis,R.drawable.maoguai,R.drawable.marc,R.drawable.marduk,R.drawable.margarethhasorin,R.drawable.marin,R.drawable.marina,R.drawable.marinesphere,R.drawable.marionette,R.drawable.marse,R.drawable.martin,R.drawable.mastering,R.drawable.mastersmith,R.drawable.matyrcard,R.drawable.mayacard,R.drawable.mayapurple,R.drawable.medusa,R.drawable.megalith,R.drawable.megalodon,R.drawable.memoryofthanatos,R.drawable.merman,R.drawable.metalinng,R.drawable.metaller,R.drawable.migao,R.drawable.mimic,R.drawable.mineral,R.drawable.minidemon,R.drawable.minorous,R.drawable.mistress,R.drawable.mistressofshelter,R.drawable.miyabi,R.drawable.mobster,R.drawable.moonlight,R.drawable.mukacard,R.drawable.mummycard,R.drawable.munak,R.drawable.muscipular,R.drawable.mutantdragonoid,R.drawable.mystcard,R.drawable.mystcase,R.drawable.mysteltainnn,R.drawable.necromanncer,R.drawable.nereid,R.drawable.nightmare,R.drawable.nightmareterror,R.drawable.ninetail,R.drawable.nnoxious,R.drawable.obeaune,R.drawable.obsidian,R.drawable.odium,R.drawable.ogretooth,R.drawable.orcarcher,R.drawable.orcbaby,R.drawable.orchero,R.drawable.orclardy,R.drawable.orclord,R.drawable.orcskeleton,R.drawable.orcwarrior,R.drawable.orczombie,R.drawable.owlbaron,R.drawable.owlduke,R.drawable.panzergoblin,R.drawable.parasite,R.drawable.pasana,R.drawable.pecopeco,R.drawable.pecopecoegg,R.drawable.penomenia,R.drawable.peremeter,R.drawable.pest,R.drawable.pharaoh,R.drawable.phencard,R.drawable.phendark,R.drawable.phreeoni,R.drawable.picky,R.drawable.pickyegg,R.drawable.pirateskel,R.drawable.pitman,R.drawable.plankton,R.drawable.plasma,R.drawable.poisonspore,R.drawable.poisonous,R.drawable.poporing,R.drawable.porcellio,R.drawable.poring,R.drawable.punkcard,R.drawable.pupa,R.drawable.quve,R.drawable.raffllasia,R.drawable.raggedzombie,R.drawable.raggler,R.drawable.randgris,R.drawable.raydricarcher,R.drawable.raydric,R.drawable.redferus,R.drawable.rednovus,R.drawable.remover,R.drawable.requiem,R.drawable.rideword,R.drawable.rocker,R.drawable.rodafrog,R.drawable.rotarzairo,R.drawable.roweencard,R.drawable.rsx,R.drawable.rybio,R.drawable.sageworm,R.drawable.salamander,R.drawable.samurai,R.drawable.sandmancard,R.drawable.santaporing,R.drawable.sasquatch,R.drawable.savagebabe,R.drawable.savage,R.drawable.scorpionn,R.drawable.scorpionking,R.drawable.seaotter,R.drawable.seekercar5d,R.drawable.seyren,R.drawable.shellfish,R.drawable.shinobi,R.drawable.sidewinder,R.drawable.siroma,R.drawable.skeggiolld,R.drawable.skelprisoner,R.drawable.skelworker,R.drawable.skeleton,R.drawable.skeletongenerall,R.drawable.skogull,R.drawable.skydeleter,R.drawable.skypetite,R.drawable.sleeper,R.drawable.smokie,R.drawable.snake,R.drawable.sniper,R.drawable.snowier,R.drawable.sohee,R.drawable.soldierandre,R.drawable.soldierskeleton,R.drawable.soldier,R.drawable.sporecard,R.drawable.springrabbit,R.drawable.stainer,R.drawable.stalactic,R.drawable.stapo,R.drawable.steelchonchon,R.drawable.stemworm,R.drawable.stingcard,R.drawable.stoneshooter,R.drawable.stormyknight,R.drawable.strouf,R.drawable.succubus,R.drawable.swordguardiann,R.drawable.swordfish,R.drawable.tamruan,R.drawable.taogunka,R.drawable.tarou,R.drawable.tatacho,R.drawable.teddybear,R.drawable.tengu,R.drawable.tharafrog,R.drawable.thepaper,R.drawable.thiefbug,R.drawable.thiefbugegg,R.drawable.toad,R.drawable.towerkeeper,R.drawable.trijoint,R.drawable.turtlegeneral,R.drawable.unngoliant,R.drawable.vadon,R.drawable.vagabondwolf,R.drawable.vanberk,R.drawable.venntau,R.drawable.venomous,R.drawable.verit,R.drawable.vesper,R.drawable.violy,R.drawable.vitata,R.drawable.vocal,R.drawable.wanderer,R.drawable.wastestove,R.drawable.whisper,R.drawable.whitelady,R.drawable.wickebine,R.drawable.wildrose,R.drawable.willow,R.drawable.windghost,R.drawable.wolf,R.drawable.woodengolem,R.drawable.wootan,R.drawable.wootanshooter,R.drawable.wormtail,R.drawable.wraithcard,R.drawable.wraithdead,R.drawable.yaojun,R.drawable.yellownovus,R.drawable.yoyocard,R.drawable.zealotus,R.drawable.zenorc,R.drawable.zeromcard,R.drawable.zhupolong ,R.drawable.zipperbear,R.drawable.zombiecard,R.drawable.zombiemaster,R.drawable.zombieprisoner,R.drawable.zombieslauthercard};
    int i = 0;

    ArrayList<DataProvider> arrayList = new ArrayList<>();


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);








        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);


        card_names = getResources().getStringArray(R.array.card_names);


        for (String name : card_names)

        {


            DataProvider dataProvider = new DataProvider(img_resArray[i], name);

            arrayList.add(dataProvider);
            i++;

        }
        //constructor from recyuvleradapppter
        mCardsRecyclerAdapter = new CardsRecyclerAdapter(arrayList,this);

        recyclerView.setHasFixedSize(true);
        recycLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recycLayoutManager);

        recyclerView.setAdapter(mCardsRecyclerAdapter);

    }



        @Override
        public boolean onCreateOptionsMenu(Menu menu) {

            getMenuInflater().inflate(R.menu.menu_items,menu);
            MenuItem menuitem = menu.findItem(action_search);
            SearchView searchView = (SearchView) MenuItemCompat.getActionView(menuitem);
            searchView.setOnQueryTextListener(this);
















            return true;
        }

        @Override
        public boolean onQueryTextSubmit(String query) {
            return false;
        }

        @Override
        public boolean onQueryTextChange(String newText) {




            newText = newText.toLowerCase();

            ArrayList<DataProvider> newarrayList = new ArrayList<>();

            for(DataProvider dataProvider : arrayList)
            {

                String name = dataProvider.getText_res() .toLowerCase();
                if(name.startsWith(newText))

                    newarrayList.add(dataProvider);



            }





            mCardsRecyclerAdapter.setFilter(newarrayList);






            return false;
        }



    }


