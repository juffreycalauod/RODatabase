package comjuffreycalauod.gmail.httpswww.RODatabase;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import it.gmariotti.recyclerview.itemanimator.SlideInOutLeftItemAnimator;

import static comjuffreycalauod.gmail.httpswww.RODatabase.R.id.action_search;

/**
 * Created by Mr.Darkycible on 9/3/2017.
 */

public class MonstersRecycler extends AppCompatActivity implements SearchView.OnQueryTextListener {


    private  MonstersRecyclerAdapter monstersRecyclerAdapter;










    String [] text_Res;

    int [] img_Res = {R.drawable.abysmaldarkkobold,R.drawable.abysmalknight,R.drawable.agav0,R.drawable.alarm0,R.drawable.alice0,R.drawable.alicel0,
            R.drawable.aliot0,R.drawable.aliza,R.drawable.alligator,R.drawable.almodi,R.drawable.alphoccio,R.drawable.ambernite0,R.drawable.amdarias,R.drawable.ammut0,
            R.drawable.amonra0,R.drawable.anacondaq,R.drawable.ancientmimic0,R.drawable.ancientmummy0,R.drawable.ancienttree,R.drawable.ancientworm0,R.drawable.andre,R.drawable.angeling0,
            R.drawable.angramantis,R.drawable.angrystudentpyuriel,R.drawable.anolian0,R.drawable.anopheles0,R.drawable.antegg,R.drawable.anubis0,R.drawable.apocalypse,R.drawable.aquaelemental0,R.drawable.archangeling0,R.drawable.archdam0,
            R.drawable.archerguardian,R.drawable.archerskeleton0,R.drawable.arclouse0,R.drawable.argiope0,R.drawable.argos0,R.drawable.armaia,R.drawable.assassincrosseremes,
            R.drawable.assaulter0,R.drawable.aster0,R.drawable.atroce0,R.drawable.aunoe,R.drawable.babayaga,R.drawable.babydesertwolf,R.drawable.babyleopard,R.drawable.bacsojin,
            R.drawable.bakonawa,R.drawable.banaspaty,R.drawable.bangungot,R.drawable.banshee0,R.drawable.bansheemaster0,R.drawable.baphomet0,R.drawable.baphometjr,R.drawable.baronessofretribution,
            R.drawable.barricade,R.drawable.bathory,R.drawable.beelzebub,R.drawable.beholder0,R.drawable.beholdermaster,R.drawable.bettleking0,R.drawable.bigfoot0,R.drawable.blackmushroom,
            R.drawable.blazer,R.drawable.bloodybutterfly,R.drawable.bloodyknight,R.drawable.bloodymurderer0,R.drawable.blueacidus0,R.drawable.bluelichtern,R.drawable.blueplant,R.drawable.boitata,R.drawable.bongun0,
            R.drawable.bowguardian0,R.drawable.bradiumgolem,R.drawable.breeze0,R.drawable.brilight0,R.drawable.byorgue0,R.drawable.caramel,R.drawable.carat,R.drawable.caterpillar,R.drawable.catoninetails,
            R.drawable.cecildamon,R.drawable.celia,R.drawable.cendrawasih,R.drawable.cenere,R.drawable.centepedelarva,R.drawable.centipede,R.drawable.championchen,R.drawable.chen,
            R.drawable.chepet,R.drawable.chimera,R.drawable.choco,R.drawable.chonchon0,R.drawable.christmascooki,R.drawable.chunge,R.drawable.civilservant,R.drawable.clock,R.drawable.clocktowermanager,
            R.drawable.cloudhermit,R.drawable.cobaltmineral,R.drawable.coco0,R.drawable.comodo,R.drawable.condor0,R.drawable.constant,R.drawable.cookie0,R.drawable.cornus0,R.drawable.cornutus0,R.drawable.crab,
            R.drawable.cramp,R.drawable.creamy0,R.drawable.creamyfear0,R.drawable.creatorflamel,R.drawable.cruiser0,R.drawable.curupira,R.drawable.dameofsentinel,R.drawable.darkframe0,R.drawable.darkguardiankades,
            R.drawable.darkillusion0,R.drawable.darklord0,R.drawable.darkpinguicula,R.drawable.darkshadow0,R.drawable.deadplankton,R.drawable.deathword0,R.drawable.deepseakapha,R.drawable.demonpungus,R.drawable.deniro,
            R.drawable.depravedorcspirit,R.drawable.desertwolf0,R.drawable.desperoofthanatos,R.drawable.detardeurus,R.drawable.deviace0,R.drawable.deviling0,
            R.drawable.deviruchi0,R.drawable.diabolic0,R.drawable.dimik0,R.drawable.disguise0,R.drawable.dokebi0,R.drawable.dolomedes,R.drawable.dolorofthanatos,
            R.drawable.doppelganger,R.drawable.draco0,R.drawable.dracoegg,R.drawable.dracula0,R.drawable.dragonegg0,R.drawable.dragonfly0,R.drawable.drainliar,R.drawable.drake0,R.drawable.draontail,R.drawable.driller0,
            R.drawable.drops0,R.drawable.drosera0,R.drawable.dryad0,R.drawable.dullahan,R.drawable.dumplingchild,R.drawable.duneyrr,R.drawable.dustiness0,R.drawable.earthdeleter0,R.drawable.earthpetite0,R.drawable.echio0,R.drawable.eclipse0,
            R.drawable.eddga0,R.drawable.eggyra,R.drawable.egnigemcenia,R.drawable.elder,R.drawable.elderwillow0,R.drawable.elvira,R.drawable.emperium,R.drawable.enchantedpeachtree,
            R.drawable.eremesguille,R.drawable.errendeebecee,R.drawable.evildruid0,R.drawable.evilsnakelord,R.drawable.executioner0,R.drawable.explosion0,R.drawable.fabre0,
            R.drawable.faithfulmanager,R.drawable.fakeangel,R.drawable.fallenbishophibram,R.drawable.familiar0,R.drawable.fanat,R.drawable.femalethiefbug,R.drawable.flamel,R.drawable.flameskull0,R.drawable.flora0,


            R.drawable.freezer0,R.drawable.frilldora0,R.drawable.frus0,R.drawable.furseal0,R.drawable.gajomart0,R.drawable.galapago0,R.drawable.galion0,R.drawable.gargoyle0,R.drawable.gazeti0,
            R.drawable.geminis58,R.drawable.generaldaehyun,R.drawable.geographer0,R.drawable.ghostring0,R.drawable.ghoul0,R.drawable.gianthornet,R.drawable.giantoctopus,R.drawable.giantspider0,R.drawable.giantwhisper0,R.drawable.gibbet0,
            R.drawable.giearth0,R.drawable.gig0,R.drawable.gioia,R.drawable.gloomundernight,R.drawable.gloomycoelacanth,R.drawable.goat0,R.drawable.goblin0,R.drawable.goblinarcher0,R.drawable.goblinleader0,R.drawable.goblinsteamrider0,
            R.drawable.goldacidusholy,R.drawable.goldantlerscaraba,R.drawable.goldantlerscarabaegg,R.drawable.goldenthiefbug,R.drawable.golem0,R.drawable.gopinich,R.drawable.grandpeco,R.drawable.greatestgeneral0,R.drawable.greenferus0,R.drawable.greenplant,
            R.drawable.gremlin0,R.drawable.grizzly,R.drawable.grove0,R.drawable.gryphon0,R.drawable.gullinbursti0,R.drawable.hardrockmammoth,R.drawable.harpy0,R.drawable.hatii0,R.drawable.hatiibabe,
            R.drawable.headlessmule,R.drawable.heater0,R.drawable.heavymetaling,R.drawable.hellapocalypse,R.drawable.hellionrevenant,R.drawable.hellpoodle0,R.drawable.highorc0,R.drawable.highpriest0,R.drawable.highwizard0,R.drawable.hillslion0,R.drawable.hillwind0,
            R.drawable.hode0,R.drawable.hodremlin0,R.drawable.holden0,R.drawable.horn0,R.drawable.hornet0,R.drawable.horong0,R.drawable.howardalteisen,R.drawable.hunterfly0,R.drawable.hydra,R.drawable.hydrolancer0,
            R.drawable.hylozoist0,R.drawable.iara,R.drawable.iceicle,R.drawable.icetitan0,R.drawable.ifrit0,R.drawable.imp0,R.drawable.incarnationofmorrocfour,R.drawable.incarnationofmorrocone,
            R.drawable.incarnationofmorrocthree,R.drawable.incarnationofmorroctwo,R.drawable.incubus0,R.drawable.injustice0,R.drawable.ironfist0,R.drawable.isilla0,R.drawable.isis0,R.drawable.jaguar,R.drawable.jakk0,R.drawable.jejeling,R.drawable.jingguai0,R.drawable.joker0,
            R.drawable.kaho0,R.drawable.kapha0,R.drawable.karakasa0,R.drawable.kasa0,R.drawable.kathrynekeyron,R.drawable.kavachicarus,R.drawable.khalitzburg0,R.drawable.kielzero,R.drawable.killermantiscard,R.drawable.kingdramoh,
            R.drawable.knightguardian,R.drawable.knocker0,R.drawable.kobold0,R.drawable.koboldarcher0,R.drawable.koboldleader0,R.drawable.kraben0,R.drawable.kraken,R.drawable.krakententacle,R.drawable.ktullanux,
            R.drawable.kublin,R.drawable.kukre0,R.drawable.ladysolace0,R.drawable.ladytanee0,R.drawable.laurellweinder,R.drawable.lavagolem0,R.drawable.leafcat0,R.drawable.leak,R.drawable.leibolma,R.drawable.les,R.drawable.lichtern,R.drawable.littlefatum,R.drawable.loliruri,R.drawable.lordknight0,R.drawable.lordofthedead0,R.drawable.lostdragon,
            R.drawable.luciolavespa0,R.drawable.lude0,R.drawable.lunatic0,R.drawable.maeroofthanatos0,R.drawable.magmaring0,R.drawable.magnolia0,R.drawable.majoruros,R.drawable.maletheifbug0,R.drawable.mandragora0,R.drawable.mantis0,R.drawable.marc0,R.drawable.marduk0,
            R.drawable.margarethasorin,R.drawable.marin0,R.drawable.marina0,R.drawable.marinesphere0,R.drawable.marionette0,R.drawable.marozkasguard,R.drawable.marse0,R.drawable.martin0,R.drawable.mastering0,R.drawable.matyr,R.drawable.mavka,R.drawable.maya,R.drawable.mayapurple0,R.drawable.medusa0,R.drawable.megalith0,R.drawable.megalodon0,
            R.drawable.memoryofthanatos0,R.drawable.menblatt,R.drawable.merman0,R.drawable.metaling,R.drawable.metaller0,R.drawable.migao0,R.drawable.mimic0,R.drawable.miming,R.drawable.mineral0,R.drawable.minidemon0,R.drawable.minorous0,
            R.drawable.mistress0,R.drawable.mistressofshelter0,R.drawable.miyabidoll,R.drawable.mobster0,R.drawable.moonlightflower,R.drawable.muka,R.drawable.mummy,R.drawable.munak0,R.drawable.muscipular0,R.drawable.mutantdragonoid0,R.drawable.myst,R.drawable.mystcase0,
            R.drawable.mysteltainn0,R.drawable.naga,R.drawable.naghtsieger,R.drawable.necromancer,R.drawable.nepenthes,R.drawable.nereid0,R.drawable.nidhoggrsshadow,R.drawable.nightmareamonra,R.drawable.nightmareancientmmummy,R.drawable.nightmareterror0,R.drawable.ninetail0,R.drawable.noxious,R.drawable.obeaune0,
            R.drawable.obsidian0,R.drawable.octupusleg,R.drawable.odiumofthanatos,R.drawable.ogretooth0,R.drawable.onehornedscaraba,R.drawable.orcarcher0,R.drawable.orcbaby0,R.drawable.orchero0,R.drawable.orclady0,R.drawable.orclord0,R.drawable.orcskeleton0,R.drawable.orcwarrior0,R.drawable.orczombie0,R.drawable.osiris0,
            R.drawable.owlbaron0,R.drawable.owlduke0,R.drawable.paladinrandel,R.drawable.panzergoblin0,R.drawable.parasite0,R.drawable.parus,R.drawable.pasana0,R.drawable.pecopeco0,R.drawable.pecopecoegg0,R.drawable.penomena,R.drawable.permeter,
            R.drawable.pest0,R.drawable.petal,R.drawable.pharaoh0,R.drawable.phen,R.drawable.phendark0,R.drawable.phreeoni0,R.drawable.phylla,R.drawable.picky0,R.drawable.pinguicula,R.drawable.piranha,R.drawable.pirateskeleton,
            R.drawable.pitman0,R.drawable.plankton0,R.drawable.plasma0,R.drawable.poisonspore0,R.drawable.poisontoad,R.drawable.pomspider,R.drawable.poporing0,R.drawable.porcellio0,R.drawable.poring0,R.drawable.potdofle,R.drawable.pouring,R.drawable.professorcelia,R.drawable.punk,
            R.drawable.pupa0,R.drawable.quve0,R.drawable.rafflesia,R.drawable.raggedzombie0,R.drawable.raggler0,R.drawable.rakescaraba,R.drawable.randel,R.drawable.rata,R.drawable.raydric0,R.drawable.raydricarcher0,R.drawable.rederuma,R.drawable.redferus0,R.drawable.redmushroom,R.drawable.rednovus0,R.drawable.redplant,
            R.drawable.remover0,R.drawable.requiem0,R.drawable.rhyncho,R.drawable.rideword0,R.drawable.rocker0,R.drawable.rodafrog0,R.drawable.rootofcorruption,R.drawable.rotarzairo0,R.drawable.roween,R.drawable.rsx0806,R.drawable.rudo,R.drawable.runawaydandelionmember,R.drawable.rybio0,R.drawable.sageworm0,R.drawable.sailorskeleton,R.drawable.salamander0,R.drawable.samuraisoheon,
            R.drawable.samuraispector,R.drawable.sandman,R.drawable.santaporing0,R.drawable.sasquatch0,R.drawable.satanmorroc,R.drawable.savage0,R.drawable.savagebabe0,R.drawable.scarabaqueen,R.drawable.scorpion,R.drawable.seaotter0,R.drawable.sedora,R.drawable.seeker,R.drawable.seyrenwindsor,R.drawable.shellfish0,R.drawable.shiningplant,R.drawable.shinobi0,
            R.drawable.sidewinder0,R.drawable.siorava,R.drawable.siroma0,R.drawable.skeggiold,R.drawable.skeleton0,R.drawable.skeletongeneral,R.drawable.skeletonprisoner,R.drawable.skeletonworker,R.drawable.skogul,
            R.drawable.skydeleter0,R.drawable.skypetite0,R.drawable.sleeper0,R.drawable.smalloctopus,R.drawable.smokie0,R.drawable.snake0,R.drawable.sniper0,R.drawable.snowier0,R.drawable.sohee0,R.drawable.soldierskeleton0,R.drawable.solider,R.drawable.spore,R.drawable.springrabbit0,
            R.drawable.sropho,R.drawable.stainer0,R.drawable.stalkergertie,R.drawable.stapo0,R.drawable.staticgolem,R.drawable.steelchonchon0,R.drawable.stemworm0,R.drawable.sting,R.drawable.stoneshooter0,R.drawable.stormyknight0,R.drawable.strouf0,R.drawable.succubus0,R.drawable.swordfish0,
            R.drawable.swordmaster,R.drawable.tamruan0,R.drawable.taogunka0,R.drawable.tarou0,R.drawable.tatacho0,R.drawable.teddybear0,R.drawable.tendrilion,R.drawable.tengu0,R.drawable.tharafrog0,R.drawable.thepaper0,R.drawable.thiefbug0,R.drawable.thiefbugegg0,R.drawable.toad0,R.drawable.toucan,R.drawable.trentini,R.drawable.trijoint0,R.drawable.turtlegeneral0,
            R.drawable.twohornedscaraba,R.drawable.ungoliant,R.drawable.uzhas,R.drawable.vadon0,R.drawable.vagabondwolf0,R.drawable.valkyrie,R.drawable.vanberk0,R.drawable.venatu,R.drawable.venomous0,R.drawable.verit0,R.drawable.vesper0,R.drawable.violy0,
            R.drawable.vitata0,R.drawable.vocal0,R.drawable.wanderer0,R.drawable.warriorlaura,R.drawable.wastestove0,R.drawable.watercrystal,R.drawable.watermelon,R.drawable.weakskeleton,R.drawable.weaksoldierskeleton,
            R.drawable.yaojun0,R.drawable.yellownovus0,R.drawable.yellowplant,R.drawable.yoyo,R.drawable.zakudam,R.drawable.zealotus0,R.drawable.zenorc0,R.drawable.zerom,R.drawable.zhupolong0,R.drawable.zipperbear0,R.drawable.zombie,R.drawable.zombiemaster0,R.drawable.zombieprisoner0,R.drawable.zombieslaughter};


    int i = 0;


    ArrayList<DataProvider> arrayList = new ArrayList<>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.monsters_recycler);

        RecyclerView recyclerView;
        RecyclerView.LayoutManager recyclerLayoutManager;

        recyclerView = (RecyclerView) findViewById(R.id.recyclerwidgett_monsters);

        text_Res = getResources().getStringArray(R.array.monnsters_arrayy);


        for (String name : text_Res)

        {

            DataProvider dataProvider = new DataProvider(img_Res[i],name);


            arrayList.add(dataProvider);

            i++;





        }


        monstersRecyclerAdapter= new MonstersRecyclerAdapter(arrayList,this);
        recyclerView.setHasFixedSize(true);
        recyclerLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recyclerLayoutManager);
        recyclerView.setAdapter(monstersRecyclerAdapter);
        recyclerView.setItemAnimator(new SlideInOutLeftItemAnimator(recyclerView));







    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_items,menu);
        MenuItem menuitem = menu.findItem(action_search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(menuitem);
        searchView.setOnQueryTextListener(this);






        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {

        newText = newText.toLowerCase();


        ArrayList<DataProvider> filterArrayList = new ArrayList<>();

        for(DataProvider dataProvider: arrayList)

        {
            String searchText = dataProvider.getText_res().toLowerCase();

            if(searchText.startsWith(newText))

            {

                filterArrayList.add(dataProvider);

            }


        }

        monstersRecyclerAdapter.setFilter(filterArrayList);



        return true;
    }




}
