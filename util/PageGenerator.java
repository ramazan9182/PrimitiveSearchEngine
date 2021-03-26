package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import domain.Page;

public class PageGenerator {

	private static final String[] DUMMY_TEXTS = { "Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
			+ "Sed vitae neque id urna tempus sollicitudin vitae in eros. Sed finibus hendrerit iaculis. Nunc ac fringilla neque, ac pulvinar dolor. "
			+ "Nam non arcu eros. Aenean at ante velit. Phasellus consectetur varius elit, id elementum tellus semper in. "
			+ "Aenean in tortor a turpis venenatis aliquet pretium ut massa. Suspendisse non ipsum magna. Nullam accumsan consectetur ipsum eu tincidunt. "
			+ "Sed pulvinar odio ante, molestie eleifend nulla rutrum id. "
			+ "Aenean laoreet, nulla sed porta consequat, dolor elit tincidunt arcu, nec ullamcorper felis arcu in quam. "
			+ "Phasellus venenatis sed est eu condimentum. Aliquam erat volutpat. Ut lacinia neque vel orci blandit, eget cursus ante pulvinar.",
			"Integer lorem justo, dapibus in efficitur a, consectetur sed sapien. Phasellus porttitor sagittis cursus. Donec sed ultricies est, vitae tristique libero. Cras est tellus, pharetra ut lectus non, ultrices blandit justo. Praesent neque mauris, finibus eu mollis nec, aliquam eget erat. Vestibulum ut odio vel dolor posuere sagittis quis id est. Aliquam eleifend odio purus, vel molestie orci luctus eget. Phasellus ut arcu eget felis molestie porttitor vel sodales lorem. Ut in tortor convallis, cursus mi sed, pharetra erat. Interdum et malesuada fames ac ante ipsum primis in faucibus. Suspendisse in eleifend quam. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vivamus sed magna vel turpis egestas elementum eu eget nibh.",
			"Donec suscipit odio gravida, viverra elit ut, aliquam lacus. Nam venenatis, mi at finibus placerat, ligula urna maximus libero, ut aliquam tellus felis sit amet nibh. Aenean vehicula tempus imperdiet. Curabitur leo lorem, volutpat a venenatis et, congue id nulla. Fusce consectetur, nibh ac malesuada bibendum, erat diam accumsan odio, non maximus dui nunc a eros. Integer at rutrum augue. Vivamus posuere eleifend est, a lobortis eros pretium a. Sed id tristique ipsum. Vestibulum mauris est, sodales ut augue at, dignissim finibus urna. Quisque quis rhoncus augue. Integer molestie imperdiet magna, nec maximus turpis volutpat eget. Vestibulum orci elit, ultrices sed porta et, sollicitudin a felis. Fusce a augue quis lectus efficitur viverra sit amet maximus elit. Sed sed urna sed metus euismod maximus a in leo.",
			"Etiam nibh mi, sodales sit amet aliquam vel, feugiat id erat. Quisque sed bibendum sem. Duis vel egestas tortor. Vestibulum in neque velit. Maecenas non facilisis sapien. Pellentesque pellentesque magna libero, sit amet tristique tortor sagittis vitae. Mauris vitae magna eget elit auctor pellentesque. Etiam vestibulum diam in euismod porta. Ut at vulputate ligula. Phasellus ornare quam eget turpis finibus interdum. Donec tristique risus sed odio rutrum, in convallis est aliquet. Sed eu egestas massa, fermentum pulvinar urna. Duis accumsan varius mauris eget dapibus. Etiam id justo ut dolor pulvinar ullamcorper. Suspendisse at dolor sed felis faucibus ullamcorper a non tellus.",
			"Donec placerat a odio vel lobortis. Nullam pretium, nunc eget accumsan imperdiet, diam quam feugiat arcu, sed tincidunt lorem tortor ac velit. Nulla nec augue maximus, porttitor dui in, mattis nisl. Curabitur volutpat quam justo, non malesuada sapien viverra eget. Mauris pellentesque blandit pretium. Pellentesque ac metus vel erat ullamcorper condimentum. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Fusce nec ex blandit, eleifend magna sit amet, ultrices nibh. Vestibulum at augue a tellus commodo cursus. Nam sit amet arcu sit amet odio pretium pharetra. Sed leo dolor, dapibus eu ultricies in, luctus gravida libero. Donec risus tellus, convallis vitae elit id, facilisis rhoncus libero. Etiam ac nunc nunc. Integer commodo eros non lectus faucibus, vitae dictum dolor lacinia. Donec tincidunt scelerisque blandit. Quisque nibh orci, iaculis vel auctor vitae, tincidunt non lorem." };

	public static List<Page> generatePages(int count) {
		List<Page> pages = new ArrayList<Page>();
		Random random = new Random();
		int previousIndex = 0;
		for (int i = 0; i < count; i++) {
			int newIndex;
			while((newIndex = random.nextInt(DUMMY_TEXTS.length)) == previousIndex) continue;
			previousIndex = newIndex;
			String content = DUMMY_TEXTS[newIndex];
			String title = content.substring(0, 10) + "...";
			pages.add(new Page(title,content));
		}
		return pages;
	}

}
