package com.basic.longtext;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A fragment representing a single step in a wizard. The fragment shows a dummy title indicating
 * the page number, along with some dummy text.
 *
 * <p>This class is used by the {@link CardFlipActivity} and {@link
 * ScreenSlideActivity} samples.</p>
 */
public class ScreenSlidePageFragment extends Fragment {
    /**
     * The argument key for the page number this fragment represents.
     */
    public static final String ARG_PAGE = "page";

    public String[] content = {
    	"Page 1 ,前言\n 媒体塑造公众观念的力量是巨大的。\n传统上，主流媒体看不到LGBT＊(女同性恋、男同性恋、双性恋、跨性别)人群。" +
    	    		"\n1949 年至上世纪90 年代初期，'同性恋'这个词在媒体中基本不存在或是负面的，几乎没有人向社会或媒体公开自己的同性恋、双性恋、跨性别倾向，" +
    	    		"大多数媒体长期以来也对此持沉默态度。近年来，随着社会的进步和资讯的发达，这种状况大为改观。1998 年6 月，《希望》杂志以21 个页面推出'认识同性恋'特刊，成为中国大陆首个由主流杂志制作的同性恋专题报道。2004 年12 月2 日，" +
    	    		"CCTV 新闻频道“央视论坛”栏目播出《同性恋：回避不如正视》，这是官方核心媒体首次正面报道同性恋人群的生存状态。\n随着媒体对LGBT 人群和议题的报道逐渐开放，越来越多公平、准确和有包容性的新闻媒体报道为提升大众对LGBT 群体的认识和理解起到很大帮助。" +
    	    		"les+ 感谢这些报道背后的媒体从业人员，为了尽到媒体的责任而付出了艰苦的努力，他们为那些忽略或有意歧视这些议题的媒体人士树立了良好榜样。\n但是，许多记者、编辑和制作人仍然面临着复杂的挑战。当越来越多的公众人物对LGBT 人群发出多元言论，引发公众的热烈关注和广泛讨论时；" +
    	    		"当LGBT 群体的生活与主流媒体报道的传统家庭、信仰、经济、健康、政治、体育、娱乐和无数的其他问题，发生越来越多相碰撞时:当“支持同性恋”或者“反对同性恋”的二元论报道已经开始变得陈旧单一时，媒体从业人员对于LGBT人群生活经验和观点的读者们。已经形成一定社会力量的同性恋群体也不再" +
    	    		"满足于在新闻媒体中始终以负面的形象出现。\n 这正是这本《LGBT 媒体报道建议手册》出现的原因。les+ 希望这本手册为关注LGBT 议题的中国媒体从业人员提供了及时和准确的信息。我们les+ 相信最好的新闻报道能通过客观的报道，感人的故事和得体的表达让所有的媒体受众得出自己的观点。当你（媒体从业人员）正在努力公正、准确地报道LGBT" +
    	    		"社群时，我们期望你能够在报道中给予LGBT 群体表达的机会。\n* 本手册全文以LGBT 简代女同性恋、男同性恋、双性恋、跨性别。",
    		"Page 2, LGBT媒体报道建议手册\n手册出品：les+ \n研究支持：社会资源研究所 \n编辑制作：刘晨、吴晨、三木、周小萌\n统筹：周小萌\n合作作者：熊婧、柯晓、付婷、Fish、虫二\n资料翻译：梁睿雪、Hilary、Gissing\n校对：Shen\n设计：Jun\n字数：53 千字\n版次：2012年12月第2版第1次印刷\n版权声明:\n本书版权为les+所有，未经许可，不得以任何形式翻印、复制或转载，侵权必究。\nles+ 是一家面向中国拉拉（女同性恋、女双性恋、爱女人的跨性别人士）的文化传播" +
    		"非营利民间组织，成立于2005 年11 月。以文化建设、艺术探索、媒体倡导为主要策略，为中国女同性恋、女双性恋、爱女人的跨性别人士创造话语空间，促进社群和公众的观念改变，实现性别和性倾向多元差异的可能性。\n邮箱：lesplus@yahoo.com.cn\n 博客：blog.sina.com.cn/lesplus \n 微博:weibo.com/lesplus\n社会资源研究所（简称SRI）是一家专注于可持续发展的研究与咨询机构，我们为政府、非营利组织和企业提供调研、评估、培训和信息服务，帮助客户更好地满足来自社会和环境的挑战，实现社会效益最大化。\n北京海淀紫竹院南路7号院212室100048 \n 电话/ 传真：+86 10 6843 7211 \n邮箱：csrglobal.cn@gmail.com" +
    		"\n网址： www.srichina.org/www.csrglobal.cn",	
    	"Page 3 \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
    		};
    
    /**
     * The fragment's page number, which is set to the argument value for {@link #ARG_PAGE}.
     */
    private int mPageNumber;

    /**
     * Factory method for this fragment class. Constructs a new fragment for the given page number.
     */
    public static ScreenSlidePageFragment create(int pageNumber) {
        ScreenSlidePageFragment fragment = new ScreenSlidePageFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, pageNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public ScreenSlidePageFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPageNumber = getArguments().getInt(ARG_PAGE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        // Inflate the layout containing a title and body text.
        ViewGroup rootView = (ViewGroup) inflater
                .inflate(R.layout.fragment_screen_slide_page, container, false);

        // Set the title view to show the page number.
        
        if (mPageNumber == 1) {
            ((TextView) rootView.findViewById(android.R.id.text1)).setText("Page 1 title");
            ((TextView) rootView.findViewById(android.R.id.text2)).setText("Page 1 body");

        } else if (mPageNumber == 2) {
        	
            ((TextView) rootView.findViewById(android.R.id.text1)).setText("Page 2 title");
            ((TextView) rootView.findViewById(android.R.id.text2)).setText("Page 2 body");

        }
        else {
        	((TextView) rootView.findViewById(android.R.id.text1)).setText("title" + mPageNumber);

        	if (mPageNumber < content.length-1) {
        		((TextView) rootView.findViewById(android.R.id.text2)).setText(content[mPageNumber]);
        	}
        }
        
        return rootView;
    }

    /**
     * Returns the page number represented by this fragment object.
     */
    public int getPageNumber() {
        return mPageNumber;
    }
}
